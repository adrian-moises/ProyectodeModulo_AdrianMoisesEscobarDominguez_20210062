package proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DTOlibors {
    private long idLibros;
    private String titulo;
    @NotBlank(message="el nombre es obligatorio")
    private String isbn;
    @NotBlank(message=" obligatoria")
    private String anio_publicacion;
    @NotBlank(message="la fecha es obligatoria")
    private Long genero;
    private long Libro_id;
}
