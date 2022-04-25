package co.edu.uniquindio.unitravel.repositorios;

import co.edu.uniquindio.unitravel.entidades.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, String> {

    List<Cliente> findAllByNombre(String nombre);

    @Query("select u from Cliente u where u.nombre = :nombre")
    List<Cliente> buscarPorNombre(String nombre);

    Optional<Cliente> findByCorreoAndPassword(String email, String password);


    /*
    Paginador, delimitador de consultas
     */
    Page<Cliente> findAll(Pageable pageable);
}
