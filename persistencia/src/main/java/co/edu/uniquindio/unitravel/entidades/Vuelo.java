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
public class Vuelo implements Serializable {

    @Id
    private Integer codigo;

    private boolean estado;
    private String aerolinea;

    @OneToMany (mappedBy = "vuelo")
    @ToString.Exclude
    private List<Silla> sillas;

    @ManyToMany
    @ToString.Exclude
    private List<Ciudad> ciudades;



}
