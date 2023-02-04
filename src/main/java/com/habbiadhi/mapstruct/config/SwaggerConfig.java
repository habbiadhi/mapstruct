package com.habbiadhi.mapstruct.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
//@EnableSwagger2
public class SwaggerConfig {

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.habbiadhi.mapstruct"))
//                .paths(PathSelectors.ant("/path/**"))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("Spring boot setup for API")
//                .description("JavaInUse API reference for developers")
//                .termsOfServiceUrl("http://javainuse.com")
//                .license("JavaInUse License")
//                .licenseUrl("javainuse@gmail.com").version("1.0").build();
//    }
}
