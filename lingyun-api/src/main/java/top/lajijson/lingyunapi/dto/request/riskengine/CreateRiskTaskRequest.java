package top.lajijson.lingyunapi.dto.request.riskengine;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Map;

/**
 * 创建任务请求
 */
@Data
public class CreateRiskTaskRequest {

    /**
     * 商户编号
     */
    @NotBlank
    private String merchantCode;

    /**
     * 风控模型
     */
    @NotBlank
    private String riskModelVersion;

    /**
     * 入模参数
     */
    @NotEmpty
    private Map<String, Object> params;

    /**
     * 回调地址
     */
    private String callBackUrl;

    /**
     * 是否主动回调，默认true
     */
    private boolean callback = true;
}
