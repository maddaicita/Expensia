package in.maddy.RestApi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Main entry point for the Spring Boot Expense Management REST API application.
 * 
 * This class bootstraps the application, sets up the Spring context, and
 * declares application-level beans like {@link ModelMapper}.
 * 
 * @author Maddy
 */
@SpringBootApplication
public class RestApiApplication {

    /**
     * Main method used to launch the Spring Boot application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }

    /**
     * Bean definition for {@link ModelMapper}.
     * 
     * Used throughout the application to map between DTOs and entities.
     *
     * @return a configured {@link ModelMapper} instance
     */
    @Bean
    public ModelMapper model() {
        return new ModelMapper();
    }
}
