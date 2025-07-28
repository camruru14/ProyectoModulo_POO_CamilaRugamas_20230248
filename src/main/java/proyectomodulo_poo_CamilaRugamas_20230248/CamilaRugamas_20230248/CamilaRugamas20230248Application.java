package proyectomodulo_poo_CamilaRugamas_20230248.CamilaRugamas_20230248;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamilaRugamas20230248Application {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue())
				);

		SpringApplication.run(CamilaRugamas20230248Application.class, args);
	}

}
