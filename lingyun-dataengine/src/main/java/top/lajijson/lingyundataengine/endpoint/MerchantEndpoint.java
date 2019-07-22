package top.lajijson.lingyundataengine.endpoint;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.lajijson.lingyundataengine.fallback.MerchantFallback;

import java.util.Map;

@FeignClient(value = "merchant",fallback = MerchantFallback.class)
public interface MerchantEndpoint {

    /**
     * 获取数据项信息
     *
     * @param params
     * @return
     */
    @PostMapping("/service/item/")
    String getItem(@RequestBody Map<String, Object> params);

}
