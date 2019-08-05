package top.lajijson.lingyundataengine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class TaskPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor dsJobTaskPool() {
        ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
        pool.setCorePoolSize(10);
        pool.setMaxPoolSize(200);
        pool.setKeepAliveSeconds(60);
        pool.setQueueCapacity(500);
        pool.setThreadNamePrefix("ds_job_");
        pool.initialize();

        return pool;
    }

    @Bean
    public ThreadPoolTaskExecutor cleanJobTaskPool() {
        ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
        pool.setCorePoolSize(10);
        pool.setMaxPoolSize(200);
        pool.setKeepAliveSeconds(60);
        pool.setQueueCapacity(500);
        pool.setThreadNamePrefix("clean_job_");
        pool.initialize();

        return pool;
    }
}
