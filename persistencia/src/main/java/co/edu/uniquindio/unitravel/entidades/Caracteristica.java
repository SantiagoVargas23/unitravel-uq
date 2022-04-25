package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Caracteristica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 200)
    private String nombre;

    @Column(nullable = false, length = 2)
    private String tipo;

    @ManyToOne
    private Hotel hotel;

    @ManyToOne
    private Habitacion habitacion;

    public Caracteristica(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
}
