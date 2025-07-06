//Paquete principal del proyecto
package com.ArticuloApi.articulo;

// Importa la clase SpringApplication que se usa para lanzar la app
import org.springframework.boot.SpringApplication;
// Importa la anotación @SpringBootApplication que indica una app Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotación que marca esta clase como punto de entrada de una aplicación Spring Boot
@SpringBootApplication
public class ArticuloApplication {
    // Método principal que lanza la aplicación

	public static void main(String[] args) {
		SpringApplication.run(ArticuloApplication.class, args);   // Inicia la aplicación
	}

}
