package top.lajijson.lingyundatasource1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LingyunDatasource1Application {

    public static void main(String[] args) {
        SpringApplication.run(LingyunDatasource1Application.class, args);
    }

}
