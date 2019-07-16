package top.lajijson.lingyundataengine.endpoint;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 商户站点
 */
@FeignClient("MERCHANT")
public interface MerchantEndpoint {

    @RequestMapping(method = RequestMethod.GET, value = "/service/item/")
    String getItem();
}
