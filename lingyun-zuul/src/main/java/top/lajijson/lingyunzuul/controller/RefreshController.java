package top.lajijson.lingyunzuul.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyunzuul.service.RefreshRouteService;

import java.util.Map;

@Slf4j
@RestController
public class RefreshController {
    @Autowired
    private RefreshRouteService refreshRouteService;

    @Autowired
    private ZuulHandlerMapping zuulHandlerMapping;

    @RequestMapping("/refresh")
    public void refresh() {
        refreshRouteService.refreshRoute();
    }

    @GetMapping("/showRoute")
    public void showRoute() {
        Map<String, Object> map = zuulHandlerMapping.getHandlerMap();
        System.out.println(map);
    }
}
