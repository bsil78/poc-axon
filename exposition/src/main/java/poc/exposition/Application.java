package poc.exposition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "poc")
@EntityScan({"org.axonframework.eventsourcing.eventstore.jpa",
    "org.axonframework.eventhandling.saga.repository.jpa", "org.axonframework.eventhandling.tokenstore.jpa",
    "poc"})
@EnableJpaRepositories(basePackages = "poc")
@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}