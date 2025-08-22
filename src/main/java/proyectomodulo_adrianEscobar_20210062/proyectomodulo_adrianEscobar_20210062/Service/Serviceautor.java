package proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.Service;

import org.springframework.beans.factory.annotation.Autowired;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.DTO.DTOautor;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.Entity.EntityLibros;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.Entity.Entityautores;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.Repository.LibroRepository;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.Repository.Repository;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.DTO.DTOlibors;

import java.util.List;
import java.util.stream.Collectors;

public class Serviceautor {
    @Autowired
    private Repository repoAutor;

    @Autowired
    private LibroRepository repoid;

    public List <DTOautor> getAllautor(){

        List< Entityautores> autores = repoAutor.findAll();
                return autores.stream()
                        .map(this::convertirA_AutorDTO)
                        .collect(Collectors.toList());
    }
    private DTOlibors convertirA_AutorDTO (EntityLibros libros){

        DTOautor dto= new DTOautor();
        dto.setIdAutor(libros.getLibro_id());



        if (libros.getIdLibros()!=null){

            dto.setNombre(libros.setIdLibros().getId());
            dto.setIdAutor(libros.setIdLibros().getId()
            );

        }else {

            dto.setNombre  ("Sin cargo asignado");
            dto.(null);

        }
        return dto;


    }

    public DTOautor insertarAutor(DTOautor dto){

        try {
        Entityautores nuevoAutor = new Entityautores();
            nuevoAutor.setIdautores(dto.getIdAutor ());


        optional<Entityautores> autorencontrado = repoAutor.findById   (dto.getId ());
        if (autorencontrado.isPresent()){
            nuevoAutor.setNombre( autorencontrado.get());
        }else {
            return null;
        }
            repoAutor.save(nuevoAutor);
            return dto;
        }catch (Exception e){
            return null;
        }

    }


    public boolean removeautor (long id){
        try {

            Entityautores objAutor = repoAutor.findById("id").orElse(null);
            if (objAutor != null) {
                repoAutor.deleteById("id");
            }
            return true;

        }{
                System.out.println("usuatio no encontrado");
            }





        }






    }
}
