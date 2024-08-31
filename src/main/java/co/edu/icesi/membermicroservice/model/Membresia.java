package co.edu.icesi.membermicroservice.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDate;

@Data
@Embeddable
public class Membresia {
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
