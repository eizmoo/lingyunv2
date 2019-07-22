package top.lajijson.lingyundataengine.fallback;

import org.springframework.stereotype.Service;
import top.lajijson.lingyunapi.dto.base.Result;
import top.lajijson.lingyunapi.dto.request.riskengine.CreateRiskTaskRequest;
import top.lajijson.lingyunapi.enums.ResultEnum;
import top.lajijson.lingyundataengine.endpoint.RiskEngineEndpoint;

/**
 * 风控引擎feign熔断
 */
@Service
public class RiskEngineFallback implements RiskEngineEndpoint {
    @Override
    public Result create(CreateRiskTaskRequest request) {
        return Result.fail(ResultEnum.FAIL);
    }
}
