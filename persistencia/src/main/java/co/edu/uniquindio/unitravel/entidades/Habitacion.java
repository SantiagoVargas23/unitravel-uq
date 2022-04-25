package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int numero;

    @Positive
    @Column(nullable = false)
    private double precio;

    @Positive
    @Column(nullable = false)
    private int capacidad;

    @ManyToOne
    private Hotel hotel;

    @OneToMany(mappedBy = "habitacion")
    private List<Foto> fotos;

    @OneToMany(mappedBy = "habitacion")
    @ToString.Exclude
    private List<Caracteristica> caracteristicas;

    @ManyToMany(mappedBy = "habitaciones")
    @ToString.Exclude
    private List<Reserva> reservas;

    @ManyToMany(mappedBy = "habitaciones")
    @ToString.Exclude
    private List<Cama> camas;




    public Habitacion(Float precio, Integer capacidad) {
        this.precio = precio;
        this.capacidad = capacidad;
    }
}
