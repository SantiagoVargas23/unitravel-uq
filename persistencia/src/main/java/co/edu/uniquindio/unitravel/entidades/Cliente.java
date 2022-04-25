package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Cliente extends Persona{


    @ElementCollection
    private List<String> telefonos;

    @OneToMany(mappedBy = "cliente")
    @ToString.Exclude
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "cliente")
    @ToString.Exclude
    private List<Comentario> comentarios;

    @ManyToOne
    private Ciudad ciudad;

    public Cliente(String cedula, String nombre, @Email String email, String password) {
        super(cedula, nombre, email, password);
    }

}
