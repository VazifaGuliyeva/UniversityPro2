package com.example.universitypro.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SpringDocumentationConfig {
    @Bean
    public OpenAPI openAPI(){
      return new OpenAPI().info(new Info()
              .title("Created by Vazifa Guliyeva")
              .version("2.0.7")
              .description("this site is made for university")
              .contact(new Contact()
                      .url("www.vazifaguliyeva.com")
                      .name("Vazifa Guliyeva")
                      .email("vezife07102002@gmail.com")));

    }
}
