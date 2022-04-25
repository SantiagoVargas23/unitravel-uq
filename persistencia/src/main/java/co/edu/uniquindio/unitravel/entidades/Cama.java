package co.edu.uniquindio.unitravel.entidades;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString
public class Cama implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int codigo;

    private String tipo;

    @ManyToMany
    @ToString.Exclude
    private List<Habitacion> habitaciones;
}
