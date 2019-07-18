package top.lajijson.lingyundataengine.endpoint;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "merchant")
public interface MerchantEndpoint {

    @GetMapping("/service/item/")
    String getItem(@RequestParam Map<String, Object> params);
}
