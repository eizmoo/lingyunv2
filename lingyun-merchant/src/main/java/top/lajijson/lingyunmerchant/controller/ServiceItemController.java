package top.lajijson.lingyunmerchant.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.lajijson.lingyunmerchant.entity.ServiceItem;

import java.util.Map;

/**
 * 服务项controller层
 *
 * @author liuwei
 */
@Slf4j
@RestController
@RequestMapping("/service/item")
public class ServiceItemController {

    @PostMapping("/")
    public String getItem(@RequestBody Map<String, Object> params) {
        log.info("{}", params);
        ServiceItem serviceItem = new ServiceItem();
        serviceItem.setUri("/hello");
        serviceItem.setServiceName("databases1");
        return JSON.toJSONString(serviceItem);
    }

}
