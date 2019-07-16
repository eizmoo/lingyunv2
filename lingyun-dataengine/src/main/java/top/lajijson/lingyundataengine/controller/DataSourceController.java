package top.lajijson.lingyundataengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyundataengine.endpoint.impl.DataSource1EndpointImpl;

import java.util.Map;

@RestController
@RequestMapping("/datasource")
public class DataSourceController {

    @Autowired
    private DataSource1EndpointImpl endpoint;

    public Map<String, Object> getResult() {
        return endpoint.invoke();
    }

}
