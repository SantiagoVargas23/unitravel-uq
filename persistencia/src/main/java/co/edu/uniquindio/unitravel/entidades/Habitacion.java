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
public class Habitacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer numero;

    @Positive
    @Column(nullable = false)
    private Float precio;

    @Positive
    @Column(nullable = false)
    private Integer capacidad;

    @ManyToOne
    private Hotel hotel;

//    @ElementCollection
//    private List<Cama> camas;

    @ElementCollection
    private List<String> fotos;

//    @ManyToMany
//    private List<Caracteristica> caracteristicas;
//
//    @OneToMany(mappedBy = "habitacion")
//    private List<ReservaHabitacion> reservas;

    public Habitacion(Float precio, Integer capacidad, Hotel hotel,  List<String> fotos) {
        this.precio = precio;
        this.capacidad = capacidad;
        this.hotel = hotel;
        this.fotos = fotos;
    }
}
