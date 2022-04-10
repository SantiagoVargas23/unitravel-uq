package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
public class Comentario implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private int codigo;

    private String comentario;
    private float calificacion;
    private Date fechaCalificacion;



}
