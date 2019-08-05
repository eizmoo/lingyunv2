package top.lajijson.lingyundataengine.service.ds.invoke;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

public interface DSInvoke {

    /**
     * 执行任务
     *
     * @param orderInfo 任务订单信息
     * @param entryFormThreadLocal 入模表结果集
     */
    void invoke(Map<String, Object> orderInfo, ThreadLocal<Map<String, Object>> entryFormThreadLocal);

    void invoke(Map<String, Object> map, ThreadLocal<Map<String, Object>> entryFormThreadLocal, CountDownLatch latch);
}
