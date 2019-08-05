package top.lajijson.lingyundataengine.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyunapi.dto.base.DataSourceResult;
import top.lajijson.lingyundataengine.endpoint.Datasource1Endpoint;
import top.lajijson.lingyundataengine.endpoint.MerchantEndpoint;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private MerchantEndpoint merchantEndpoint;

    @Autowired
    private Datasource1Endpoint datasource1Endpoint;

    @GetMapping("")
    public String getInfo() {
        Map<String, Object> params = new HashMap<>(1);
        params.put("who", "david");
//        String result = merchantEndpoint.getItem(params);
        DataSourceResult result = datasource1Endpoint.hello(params);
        System.out.println("result: " + result);
        return JSON.toJSONString(result);
    }

}
