package top.lajijson.lingyundataengine.entity.base;

import lombok.Data;

@Data
public class ServiceItem {

    private String uri;

    /**
     * 服务名
     */
    private String serviceName;

    /**
     * 获取url
     *
     * @return
     */
    public String getCompleteUrl() {
        return "http://" + serviceName + uri;
    }
}
