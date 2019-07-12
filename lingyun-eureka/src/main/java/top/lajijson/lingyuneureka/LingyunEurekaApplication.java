package top.lajijson.lingyuneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LingyunEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LingyunEurekaApplication.class, args);
    }

}
