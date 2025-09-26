package com.example.scms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
public void addCorsMappings(CorsRegistry corsRegistry){
    corsRegistry.addMapping("/**")
            .allowedOrigins("http://localhost:3000")
            .allowedMethods("GET","POST","PUT","DELETE")
            .allowedHeaders("*");
}

        };
    }
}
//@Configuration annotation missing hai → Spring is class ko config ke tarah load hi nahi kar raha.
//
//@Bean bhi missing hai → corsConfigurer() ko bean register karna padega.
//
//Method public WebMvcConfigurer corsConfigurer() ko Spring detect nahi karega bina @Bean.