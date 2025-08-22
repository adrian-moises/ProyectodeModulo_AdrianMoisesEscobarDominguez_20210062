package proyectomodulo_adrianEscobar_20210062.proyectomodulo_adrianEscobar_20210062;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProyectomoduloAdrianEscobar20210062Application.class);
	}

}
