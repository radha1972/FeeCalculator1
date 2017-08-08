package main.java.net.viralpatel.spring.config;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "main.java.net.viralpatel.spring")
public class AppConfig {

}