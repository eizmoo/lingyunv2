package top.lajijson.lingyundatasource1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyundatasource1.entity.base.DataSourceResult;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("")
public class HelloController {

    @PostMapping("/hello")
    public DataSourceResult hello(Map<String, Object> params) {
        log.info("{}", params);
        DataSourceResult dataSourceResult = new DataSourceResult();
        dataSourceResult.setCode(200);
        dataSourceResult.setData("get you");
        dataSourceResult.setFee(true);
        dataSourceResult.setServiceItemCode("sfaffja");
        dataSourceResult.setServicePackageCode("fsauij");
        return dataSourceResult;
    }

}
