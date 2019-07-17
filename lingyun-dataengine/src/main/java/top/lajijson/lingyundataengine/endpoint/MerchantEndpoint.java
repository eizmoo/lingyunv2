package top.lajijson.lingyundataengine.endpoint;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "merchant")
public interface MerchantEndpoint {

    @GetMapping("/service/item/")
    String getItem();
}
