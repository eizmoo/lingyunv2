package top.lajijson.lingyunmerchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LingyunMerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(LingyunMerchantApplication.class, args);
    }

}
