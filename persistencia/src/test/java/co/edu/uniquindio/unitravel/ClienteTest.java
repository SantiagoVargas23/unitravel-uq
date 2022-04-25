package co.edu.uniquindio.unitravel;

import co.edu.uniquindio.unitravel.entidades.Cliente;
import co.edu.uniquindio.unitravel.repositorios.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ClienteTest {

    @Autowired
    private ClienteRepo usuarioRepo;


    @Test
    public void registrarUsuarioTest() {
        Cliente cliente = new Cliente("92999","pepito","pepe@gmail.com","1222");
        Cliente clienteGuardado= usuarioRepo.save(cliente);

        Assertions.assertNotNull(clienteGuardado);
    }

    @Test
    public void eliminarCliente()
    {
        Cliente cliente = new Cliente("92999","pepito","pepe@gmail.com","1222");

        //Primero lo guardamos
        Cliente clienteGuardado = usuarioRepo.save(cliente);
        //Luego lo eliminamos
        usuarioRepo.delete(clienteGuardado);

        //Por último, verificamos que si haya quedado borrado
        Cliente clienteBuscado = usuarioRepo.findById("92999").orElse(null);
        Assertions.assertNull(clienteBuscado);
    }
    @Test
    public void modificarCliente(){
        Cliente cliente = new Cliente("92999","pepito","pepe@gmail.com","1222");

        //Primero lo guardamos
        Cliente clienteGuardado = usuarioRepo.save(cliente);

        clienteGuardado.setCedula("1095");
        usuarioRepo.save(clienteGuardado);

        Cliente clienteBuscado= usuarioRepo.findById("1095").orElse(null);
        Assertions.assertEquals("1095",clienteBuscado.getCedula());
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listar(){
        List<Cliente> clientes= usuarioRepo.findAll();
        System.out.println(clientes);
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void listarUsuariosPorNombre(){
        List<Cliente> clientes= usuarioRepo.buscarPorNombre("nn1");
        System.out.println(clientes);
    }
    @Test
    @Sql("classpath:dataset.sql")
    public void comprobarDatosAutenticacion(){
        Optional<Cliente> cliente= usuarioRepo.findByCorreoAndPassword("nn3@gmail.com", "12");
        System.out.println(cliente);
    }

    @Test
    @Sql("classpath:dataset.sql")
    public void listarUsuariosPaginador(){

        Page<Cliente> cliente = usuarioRepo.findAll(PageRequest.of(0, 2));
        cliente.get().forEach(System.out::println);

    }
    @Test
    @Sql("classpath:dataset.sql")
    public void listarUsuariosSort(){
        List<Cliente> cliente = usuarioRepo.findAll(Sort.by("nombre"));
        cliente.forEach(System.out::println);

    }



}