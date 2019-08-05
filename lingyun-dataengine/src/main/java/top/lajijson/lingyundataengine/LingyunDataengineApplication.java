package top.lajijson.lingyundataengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class LingyunDataengineApplication {

    public static void main(String[] args) {
        SpringApplication.run(LingyunDataengineApplication.class, args);
    }

}
