package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Silla implements Serializable {

    @Id
    @Column(nullable = false)
    private int codigo;

    private String posicion;
    private double precio;

    @ManyToMany
    @ToString.Exclude
    private List<Reserva> reservas;

    @ManyToOne
    private Vuelo vuelo;

}
