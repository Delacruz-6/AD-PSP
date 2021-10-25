package com.salesianostriana.dam.E07ModeloDeDatos.models;

import lombok.*;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Builder @Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AddedToPK implements Serializable {

    private Long alumno_id;

    private Long asignatura_id;

}
