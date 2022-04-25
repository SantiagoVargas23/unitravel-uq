package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.naming.spi.ResolveResult;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Actividad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;

    private String nombre;
    private double precio;

    @ManyToOne
    private Reserva reserva;

}
