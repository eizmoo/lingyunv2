package top.lajijson.lingyundataengine.service;

import top.lajijson.lingyundataengine.entity.base.DataSourceResult;
import top.lajijson.lingyundataengine.entity.base.ServiceItem;

import java.util.Map;

public interface RemoteService {

    /**
     * 调用数据源
     *
     * @param item
     * @param params
     * @return
     */
    DataSourceResult call(ServiceItem item, Map<String, Object> params);
}
