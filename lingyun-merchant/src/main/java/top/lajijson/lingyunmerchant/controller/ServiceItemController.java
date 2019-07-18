package top.lajijson.lingyunmerchant.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/")
    public String getItem(@RequestParam Map<String, Object> params) {
        log.info("{}", params);
        ServiceItem serviceItem = new ServiceItem();
        serviceItem.setUri("/hello");
        serviceItem.setServiceName("databases1");
        return JSON.toJSONString(serviceItem);
    }

}
