package top.lajijson.lingyundataengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyundataengine.endpoint.MerchantEndpoint;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private MerchantEndpoint merchantEndpoint;

    @GetMapping("")
    public String getInfo() {
        return merchantEndpoint.getItem();
//        return "11";
    }

}
