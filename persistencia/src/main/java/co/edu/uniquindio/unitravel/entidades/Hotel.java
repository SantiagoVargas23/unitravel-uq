package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
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

    @ManyToMany
    private List<Caracteristica> caracteristicas;



}
