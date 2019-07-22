package top.lajijson.lingyundataengine.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyunapi.dto.base.Result;
import top.lajijson.lingyunapi.dto.request.riskengine.CreateRiskTaskRequest;
import top.lajijson.lingyundataengine.endpoint.RiskEngineEndpoint;

import java.util.HashMap;
import java.util.Map;

/**
 * 风控相关controller
 */
@Slf4j
@RestController
@RequestMapping("/risk")
public class RiskController {

    @Autowired
    private RiskEngineEndpoint riskEngineEndpoint;

    @PostMapping("/create")
    public Result create() {
        CreateRiskTaskRequest request = new CreateRiskTaskRequest();
        request.setMerchantCode("test");
        request.setRiskModelVersion("v1.0.0");
        request.setCallBackUrl("http://baidu.com");

        Map<String, Object> params = new HashMap<>();
        params.put("name", "张三");
        params.put("idno", "372928199512170217");
        params.put("phone", "13812345678");

        request.setParams(params);

        Result result = riskEngineEndpoint.create(request);
        log.info("result:{}", result);
        return result.isSuccess() ? Result.success() : Result.fail();
    }


}
