package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;


@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Comentario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int codigo;

    private String comentario;
    private float calificacion;
    private Date fechaCalificacion;

    @ManyToOne
    private Hotel hotel;

    @ManyToOne
    private Cliente cliente;


}
