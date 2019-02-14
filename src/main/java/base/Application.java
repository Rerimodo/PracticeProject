package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"base.repo"})
@EntityScan("base/model")
public class Application {
    public static void main(String[] args) {
        if(args.length > 0 && args[0].equals("tg")) {

        }
        SpringApplication.run(Application.class, args);
    }

}