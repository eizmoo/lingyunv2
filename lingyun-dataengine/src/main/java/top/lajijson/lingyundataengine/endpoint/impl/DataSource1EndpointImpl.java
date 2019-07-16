package top.lajijson.lingyundataengine.endpoint.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lajijson.lingyundataengine.endpoint.DateSourceEndpoint;
import top.lajijson.lingyundataengine.endpoint.MerchantEndpoint;
import top.lajijson.lingyundataengine.entity.base.DataSourceResult;
import top.lajijson.lingyundataengine.entity.base.ServiceItem;
import top.lajijson.lingyundataengine.service.RemoteService;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据源站点，访问数据源，清洗数据
 *
 * @author liuwei
 */
@Slf4j
@Service
public class DataSource1EndpointImpl implements DateSourceEndpoint {

    @Autowired
    private RemoteService remoteService;

    @Autowired
    private MerchantEndpoint merchantEndpoint;

    @Override
    public Map<String, Object> invoke() {
        // 执行的服务项
        ServiceItem serviceItem = JSON.parseObject(merchantEndpoint.getItem(), ServiceItem.class);

        Map<String, Object> param = new HashMap<>();
        param.put("name", "张三");
        param.put("idno", "460003199505110218");

        DataSourceResult remoteResult = remoteService.call(serviceItem, param);

        JSONObject data = JSON.parseObject(remoteResult.getData());

        Map<String, Object> map = new HashMap<>();
        // 插入到入模表中

        return map;
    }
}
