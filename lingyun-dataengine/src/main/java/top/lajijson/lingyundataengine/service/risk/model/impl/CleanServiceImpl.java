package top.lajijson.lingyundataengine.service.risk.model.impl;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import top.lajijson.lingyundataengine.service.ds.invoke.DSInvoke;
import top.lajijson.lingyundataengine.service.risk.model.CleanService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CleanServiceImpl implements CleanService {

    @Autowired
    private Map<String, DSInvoke> dsMap;

    @Autowired
    @Qualifier("cleanJobTaskPool")
    private ThreadPoolTaskExecutor cleanTaskPool;

    @Override
    public void doClean() {
        // mock任务list
        List<String> jobList = new ArrayList<>();

        // 每一个任务起新的线程去执行
        jobList.forEach(job -> cleanTaskPool.execute(() -> {
            // job对象包含风控模型
            // 风控模型有对应的数据源数据源list
            // 这里要对list的每个数据源执行invoke，即清洗方法

            // 最终结果保存的对象实体
            ThreadLocal<Map<String, Object>> entryFormThreadLocal = ThreadLocal.withInitial(Maps::newConcurrentMap);

            // 此job的订单信息，用来去数据源取数据
            Map<String, Object> map = new HashMap<>();
            new ArrayList<>().forEach(ds -> dsMap.get(ds).invoke(map, entryFormThreadLocal));
        }));

    }
}
