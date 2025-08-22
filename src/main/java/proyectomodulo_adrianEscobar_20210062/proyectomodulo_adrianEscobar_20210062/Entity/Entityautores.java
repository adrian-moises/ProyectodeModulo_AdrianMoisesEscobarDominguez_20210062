package proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.Entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.lang.model.element.Name;
import java.time.LocalDate;
import java.util.Date;

@Getter @Setter @ToString @EqualsAndHashCode
@Entity
@Table(name="autores")
public class Entityautores {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_libro")
    @SequenceGenerator(name="seq_libro",sequenceName = "seq_libro",allocationSize = 1)

    @Column(name="IDautores" )
    private Long idautores;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido ;

    @Column(name = "macionalidad")
    private String nacionalidad;

    @Column(name = "fecha_nacimiento")
    private LocalDate fecha_nacimiento;


}
