package top.lajijson.lingyundataengine.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
//@Component
public class LogAop {

    @Pointcut("execution(* top.lajijson.lingyundataengine.controller..*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        log.info("before aop");
    }

}
