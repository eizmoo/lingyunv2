package top.lajijson.lingyundataengine.endpoint;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.lajijson.lingyunapi.dto.base.Result;
import top.lajijson.lingyunapi.dto.request.riskengine.CreateRiskTaskRequest;
import top.lajijson.lingyundataengine.fallback.RiskEngineFallback;

@FeignClient(value = "riskengine", path = "/riskengine",fallback = RiskEngineFallback.class)
public interface RiskEngineEndpoint {

    /**
     * 创建任务
     *
     * @return
     */
    @PostMapping("/task/create")
    Result create(@RequestBody CreateRiskTaskRequest request);
}
