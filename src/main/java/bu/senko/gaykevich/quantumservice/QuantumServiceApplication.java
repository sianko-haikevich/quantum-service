package bu.senko.gaykevich.quantumservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class QuantumServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuantumServiceApplication.class, args);
    }

}
