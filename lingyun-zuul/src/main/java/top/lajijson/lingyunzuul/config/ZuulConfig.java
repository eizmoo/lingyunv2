/*
package top.lajijson.lingyunzuul.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ZuulConfig {

    @Autowired
    ZuulProperties zuulProperties;

    @Autowired
    ServerProperties serverProperties;

    @Bean
    public CustomRouteLocator routeLocator() {
        log.info("servletPath{}", this.serverProperties.getServletPath());
        log.info("contextPath{}",this.serverProperties.getContextPath());
        CustomRouteLocator routeLocator = new CustomRouteLocator(this.serverProperties.getContextPath(), zuulProperties);
        return routeLocator;
    }

}
*/
