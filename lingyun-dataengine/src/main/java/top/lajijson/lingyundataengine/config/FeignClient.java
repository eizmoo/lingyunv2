package top.lajijson.lingyundataengine.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FeignClient {

    public static int connectTimeOutMillis = 12000;
    public static int readTimeOutMillis = 12000;

//    @Bean
    public Request.Options setOptions() {
        return new Request.Options(connectTimeOutMillis, readTimeOutMillis);
    }


}
