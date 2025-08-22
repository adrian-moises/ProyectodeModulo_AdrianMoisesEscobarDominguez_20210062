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
@Table(name="libros")
public class EntityLibros {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq-autor")
    @SequenceGenerator(name="seq-autor",sequenceName = "seq-autor",allocationSize = 1)

    @Column(name="idLibros" )
    private Long idLibros;

    @Column(name = "Titulo")
    private String Titulo;

    @Column(name = "isbn")
    private String isbn ;

    @Column(name = "año_publicacion")
    private String año_publicacion;

    @Column(name = "genero")
    private LocalDate genero;

    @Column(name = "id")
    private long Libro_id;

}
