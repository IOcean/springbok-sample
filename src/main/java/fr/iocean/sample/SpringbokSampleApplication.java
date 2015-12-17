package fr.iocean.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringbokSampleApplication {

    public static final String API_ROOT_PATH = "/api";
    
    public static void main(String[] args) {
        SpringApplication.run(SpringbokSampleApplication.class, args);
    }
}
