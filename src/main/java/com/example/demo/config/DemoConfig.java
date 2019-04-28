package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DemoConfig {

    @Configuration
    public class MyWebMvcConfig {

        @Bean
        public WebMvcConfigurer forwardToIndex() {
            return new WebMvcConfigurer() {
                @Override
                public void addViewControllers(ViewControllerRegistry registry) {
                    // forward requests to /admin and /user to their index.html
                    registry.addViewController("/").setViewName(
                            "forward:/index.html");
                }
            };
        }

    }
}
