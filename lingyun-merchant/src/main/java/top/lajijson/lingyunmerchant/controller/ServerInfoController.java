package top.lajijson.lingyunmerchant.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/server/")
public class ServerInfoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public String info() {
        return "This is merchant-server. Port is " + port;
    }

}
