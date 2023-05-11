package vn.code.skystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SkystoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkystoreApplication.class, args);
    }

    @Bean
    public void start() {
        System.out.println("Start 5544 ------>");
    }

}
