package top.lajijson.lingyundataengine.endpoint;


import java.util.Map;

public interface DateSourceEndpoint {

    /**
     * 执行数据源数据获取、解析
     *
     * @return
     */
    Map<String, Object> invoke();


}
