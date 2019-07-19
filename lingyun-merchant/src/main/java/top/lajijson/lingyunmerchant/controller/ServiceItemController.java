package top.lajijson.lingyunmerchant.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.lajijson.lingyunmerchant.entity.ServiceItem;

import java.util.Map;
import java.util.concurrent.TimeUnit;

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
        try {
            log.info("i am here");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("{}", params);
        ServiceItem serviceItem = new ServiceItem();
        serviceItem.setUri("/hello");
        serviceItem.setServiceName("databases1");
        return JSON.toJSONString(serviceItem);
    }

}
