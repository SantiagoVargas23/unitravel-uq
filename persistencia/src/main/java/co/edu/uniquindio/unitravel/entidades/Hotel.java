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
public class Hotel implements Serializable {

    @Id
    private int codigo;

    @Column(length = 100)
    private String nombre;
    @Column(length = 200)
    private String direccion;
    @Column(length = 40)
    private String telefono;
    private int estrella;

    @OneToMany(mappedBy = "hotel")
    @ToString.Exclude
    private List<Caracteristica> caracteristicas;

    @OneToMany(mappedBy = "hotel")
    @ToString.Exclude
    private List<Habitacion> habitaciones;

    @ManyToOne
    private Ciudad ciudad;

    @OneToMany (mappedBy = "hotel")
    private List<Foto> fotos;

    @OneToMany (mappedBy = "hotel")
    @ToString.Exclude
    private List<Comentario> comentarios;

    @ManyToOne
    private AdministradorHotel administradorHotel;

    public Hotel(int codigo, String nombre, String direccion, String telefono, int estrella) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrella = estrella;
    }
}
