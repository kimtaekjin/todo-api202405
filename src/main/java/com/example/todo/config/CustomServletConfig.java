package com.example.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomServletConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //CORS 설정을 적용할 url
                .allowedOrigins("*") //공유를 허락할 origin을 설정(origin)
                .allowedMethods("HEAD", "GET", "POST", "PUT", "DELETE", "OPTIONS") //요청방식
                .maxAge(300)//요청정보
                .allowedHeaders("Authorization", "Cache-Control", "Content-Type");




    }
}
