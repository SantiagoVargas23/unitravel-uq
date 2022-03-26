package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Usuario extends Persona implements Serializable {

    @Email
    @Column( length = 200, nullable = false, unique = true)
    private String email;

    @ElementCollection
    private Map<String , String> telefono;

    @ManyToOne
    @JoinColumn(nullable = false)
    Ciudad ciudad;

    @OneToMany(mappedBy = "persona")
    private List<Prestamo> prestamos;

    public Usuario(String cedula, String nombre, String email) {
        super(cedula, nombre);
        this.email = email;
    }
}
