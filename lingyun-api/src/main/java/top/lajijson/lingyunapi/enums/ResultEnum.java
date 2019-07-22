package top.lajijson.lingyunapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultEnum {

    /**
     * 请求成功
     */
    SUCCESS(200, "请求成功"),
    /**
     * 未知异常
     */
    FAIL(500, "未知异常"),
    /**
     * 验签失败
     */
    AUTHENTICATION_FAILURE(999, "验签失败"),
    ;

    private int code;
    private String msg;

}
