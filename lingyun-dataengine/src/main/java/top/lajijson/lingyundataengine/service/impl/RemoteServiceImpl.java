package top.lajijson.lingyundataengine.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import top.lajijson.lingyundataengine.entity.base.DataSourceResult;
import top.lajijson.lingyundataengine.entity.base.ServiceItem;
import top.lajijson.lingyundataengine.service.RemoteService;

import java.util.Map;

@Slf4j
@Service
public class RemoteServiceImpl implements RemoteService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public DataSourceResult call(ServiceItem item, Map<String, Object> params) {

        // 获得形式类似于 http://MERCHANT/server/info 的url
        String url = item.getCompleteUrl();
        MultiValueMap<String, Object> requestParam = new LinkedMultiValueMap<>();

        params.forEach(requestParam::add);

        DataSourceResult result = restTemplate.postForObject(url, requestParam, DataSourceResult.class);

        log.info("{}", result);

        return result;
    }
}
