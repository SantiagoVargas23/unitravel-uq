package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Ciudad implements Serializable {

    @Id
    private int codigoPostal;

    @Column(nullable = false)
    private String nombre;

    @OneToMany (mappedBy = "ciudad")
    @ToString.Exclude
    private List<Hotel> hoteles;

    @OneToMany (mappedBy = "ciudad")
    @ToString.Exclude
    private List<Cliente> clientes;

    @ManyToMany (mappedBy = "ciudades")
    @ToString.Exclude
    private List<Vuelo> vuelos;


}
