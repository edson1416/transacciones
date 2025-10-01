package com.edsonsarmiento.transacciones.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8081");
        server.description("Desarrollo");

        return new OpenAPI()
                .addServersItem(server)
                .info(new Info()
                        .title("Transacciones bancarias")
                        .description("Microservicio para la gestion de transacciones bancarias")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Edson Sarmiento")
                                .email("edsonariel.sarmiento@gmail.com")
                        )
                );
    }
}
