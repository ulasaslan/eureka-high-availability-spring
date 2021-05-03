package ulas.eurekahighavailabilityspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaHighAvailabilitySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHighAvailabilitySpringApplication.class, args);
    }

}
