package top.lajijson.lingyundatasource1.entity.base;

import lombok.Data;

/**
 * 数据源结果返回result
 *
 * @author liuwei
 */
@Data
public class DataSourceResult {

    private int code;

    /**
     * json格式的数据
     */
    private String data;

    /**
     * 是否收费
     */
    private boolean fee;

    /**
     * 服务包
     */
    private String servicePackageCode;

    /**
     * 服务项code
     */
    private String serviceItemCode;


}
