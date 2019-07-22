package top.lajijson.lingyunriskengine.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lajijson.lingyunapi.dto.base.Result;
import top.lajijson.lingyunapi.dto.request.riskengine.CreateRiskTaskRequest;

@Slf4j
@RestController
@RequestMapping("/task")
public class RiskController {

    /**
     * 创建任务
     *
     * @return
     */
    @PostMapping("/create")
    public Result create(@RequestBody CreateRiskTaskRequest request) {
        log.info("创建任务：{}", request);
        return Result.success();
    }

}
