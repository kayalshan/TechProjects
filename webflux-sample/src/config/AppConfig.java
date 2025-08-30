package com.example.webfluxdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@Configuration
public class AppConfig {

    // Define a bounded elastic scheduler for I/O bound tasks
    @Bean
    public Scheduler ioScheduler() {
        return Schedulers.boundedElastic();
    }
}
