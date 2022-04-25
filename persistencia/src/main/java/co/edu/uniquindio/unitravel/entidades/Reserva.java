package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reserva implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int codigo;

    @Column(nullable = false)
    private Date fechaReserva;
    @Column(nullable = false)
    private Date fechaInicio;
    @Column(nullable = false)
    private Date fechaFin;

    @Column(nullable = false)
    private double precioTotal;

    private boolean estado;

    @Column(nullable = false)
    private int cantidadPersona;

    @ManyToOne
    private Cliente cliente;

    @OneToMany (mappedBy = "reserva")
    @ToString.Exclude
    private List<Vehiculo> vehiculos;

    @OneToMany (mappedBy = "reserva")
    @ToString.Exclude
    private List<Actividad> actividads;

    @ManyToMany (mappedBy = "reservas")
    @ToString.Exclude
    private List<Silla> sillas;

    @ManyToMany
    @ToString.Exclude
    private List<Habitacion> habitaciones;





}
