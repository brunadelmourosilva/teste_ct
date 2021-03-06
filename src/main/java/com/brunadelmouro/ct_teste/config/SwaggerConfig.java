package com.brunadelmouro.ct_teste.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.brunadelmouro.ct_teste.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API REST - Pizzaria")
                .description("API desenvolvida para o teste técnico da empresa CI&T, cujo objetivo é registrar sabores de pizzas.")
                .version("1.0")
                .contact(contact())
                .build();
    }

    private Contact contact() {
        return new Contact("Bruna Delmouro",
                "https://github.com/brunadelmourosilva",
                "brunadelmouro@gmail.com");
    }
}
