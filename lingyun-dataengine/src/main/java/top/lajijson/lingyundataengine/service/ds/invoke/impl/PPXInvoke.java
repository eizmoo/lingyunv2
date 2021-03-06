package top.lajijson.lingyundataengine.service.ds.invoke.impl;

import org.springframework.stereotype.Service;
import top.lajijson.lingyundataengine.service.ds.invoke.DSInvoke;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

@Service("ppxInvoke")
public class PPXInvoke implements DSInvoke {

    @Override
    public void invoke(Map<String, Object> orderInfo, ThreadLocal<Map<String, Object>> entryFormThreadLocal) {

        try {
            // 模拟调用第三方延时
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entryFormThreadLocal.get().put("isBlack", "1");
    }

    @Override
    public void invoke(Map<String, Object> map, ThreadLocal<Map<String, Object>> entryFormThreadLocal, CountDownLatch latch) {
        invoke(map, entryFormThreadLocal);
        latch.countDown();
    }
}
