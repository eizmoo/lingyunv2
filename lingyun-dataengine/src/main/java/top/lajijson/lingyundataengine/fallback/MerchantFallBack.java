package top.lajijson.lingyundataengine.fallback;

import org.springframework.stereotype.Service;
import top.lajijson.lingyundataengine.endpoint.MerchantEndpoint;

import java.util.Map;

@Service
public class MerchantFallBack implements MerchantEndpoint {
    @Override
    public String getItem(Map<String, Object> params) {
        return "服务调用失败";
    }
}
