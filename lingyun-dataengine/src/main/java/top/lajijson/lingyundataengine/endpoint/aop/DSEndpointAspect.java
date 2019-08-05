package top.lajijson.lingyundataengine.endpoint.aop;

import com.alibaba.fastjson.JSON;
import feign.Request;
import feign.Response;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import top.lajijson.lingyunapi.dto.base.DataSourceResult;

import java.util.Map;

@Slf4j
@Aspect
//@Component
public class DSEndpointAspect {

    //    @Pointcut(value = "@annotation(DSEndpointAspectAnnotation)")
    @Pointcut("execution(* org.springframework.cloud.netflix.feign.ribbon.LoadBalancerFeignClient.*(..))")
    public void pointcut() {
    }

    @Around(value = "pointcut()")
    public Object aroundDS(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        Request request = (Request) args[0];

        String body = new String(request.body(), request.charset());
        Map<String, Object> params = JSON.parseObject(body, Map.class);

        log.info("param:: {}", params);

        Object result = null;

        if (hitCache(params)) {
            // 如果命中缓存，从缓存中取到值
            result = new DataSourceResult();
            log.info("hit cache :: result {}", result);
        } else {
            try {
                result = pjp.proceed();
                log.info("rpc :: result {}", result);
                log.info("rpc :: resultJSON {}", JSON.toJSONString(result));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }

        return result;
    }

    /**
     * 是否命中缓存
     *
     * @param params
     * @return
     */
    private boolean hitCache(Map<String, Object> params) {
        return false;
    }

    //Object[] args = pjp.getArgs();
    //        /*Map<String, Object> params = (Map<String, Object>) args[0];
    //
    //        log.info("param:: {}", params);
    //
    //        DataSourceResult result = null;
    //        if (hitCache(params)) {
    //            // 如果命中缓存，从缓存中取到值
    //            result = new DataSourceResult();
    //            log.info("hit cache :: result {}", result);
    //        } else {
    //            try {
    //                result = (DataSourceResult) pjp.proceed();
    //                log.info("rpc :: result {}", result);
    //            } catch (Throwable throwable) {
    //                throwable.printStackTrace();
    //            }
    //        }*/
}
