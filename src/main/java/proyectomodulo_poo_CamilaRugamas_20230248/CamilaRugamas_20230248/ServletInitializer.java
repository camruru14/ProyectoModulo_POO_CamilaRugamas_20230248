package proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CamilaRugamas20230248Application.class);
	}

}
