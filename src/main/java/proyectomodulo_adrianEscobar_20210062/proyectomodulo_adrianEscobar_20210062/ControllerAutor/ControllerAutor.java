package proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.ControllerAutor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ClientHttpResponseDecorator;
import org.springframework.web.bind.annotation.*;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.DTO.DTOautor;
import proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062.Service.Serviceautor;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class ControllerAutor {
    @Autowired
    private Serviceautor acceso;
    @GetMapping("/autor")
    public List<DTOautor> datosAutores(){
        return acceso.getAllautor();
    }
    @PostMapping("/ingresarUsuario")
    public ResponseEntity <Map<String, Objects>>,registrarautor
            (@Valid @RequestBody DTOautor oautor , HttpServletRequest request){
        try {
            DTOautor respuesta = acceso.insertarAutor(oautor);
            if ( respuesta == null){
                return ResponseEntity.badRequest().body(Map.of(


                ));
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                    "",""

            ));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(

                    "",""
            ));
        }
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of(
                        "",""
                ));


    }





}
