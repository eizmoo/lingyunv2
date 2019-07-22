package top.lajijson.lingyunriskengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LingyunRiskengineApplication {

    public static void main(String[] args) {
        SpringApplication.run(LingyunRiskengineApplication.class, args);
    }

}
