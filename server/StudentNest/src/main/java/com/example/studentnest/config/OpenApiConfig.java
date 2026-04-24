package com.example.studentnest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI studentNestOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("StudentNest API")
                        .description("API cho ứng dụng hỗ trợ sinh viên quản lý đời sống đại học")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("StudentNest Team")
                                .email("team@studentnest.com")));
    }
}
