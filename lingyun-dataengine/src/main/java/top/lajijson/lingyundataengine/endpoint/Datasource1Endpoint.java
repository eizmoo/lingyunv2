package top.lajijson.lingyundataengine.endpoint;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import top.lajijson.lingyunapi.dto.base.DataSourceResult;
import top.lajijson.lingyundataengine.endpoint.aop.DSEndpointAspectAnnotation;

import java.util.Map;

@FeignClient(name = "DATABASES1")
public interface Datasource1Endpoint {

    @DSEndpointAspectAnnotation
    @PostMapping("/hello")
    DataSourceResult hello(Map<String, Object> params);

}
