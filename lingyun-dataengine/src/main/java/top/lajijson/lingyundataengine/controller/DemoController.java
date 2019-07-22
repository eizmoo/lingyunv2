package top.lajijson.lingyundataengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyundataengine.endpoint.MerchantEndpoint;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private MerchantEndpoint merchantEndpoint;

    @GetMapping("")
    public String getInfo() {
        Map<String, Object> params = new HashMap<>(1);
        params.put("who", "david");
        String result = merchantEndpoint.getItem(params);
        System.out.println("result: " + result);
        return result;
    }

}
