package proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.DTO;


import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.apache.logging.log4j.message.Message;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class DTOautor {

    private long idAutor;
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message="El Apellido es obligatorio")
    private String apellido;
    @NotBlank(message="la nacionadlidad  es obligatoria")
    private String Nacionalidad;
    @NotBlank(message="la fecha es obligatoria")
    private Long Fechanacimiento;



}
