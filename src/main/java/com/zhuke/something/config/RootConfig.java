package com.zhuke.something.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZHUKE on 2016/9/27.
 */
@Configuration
@ComponentScan(basePackages = "com.zhuke.something")
public class RootConfig {

    @Bean
    public String test(String s) {
        return "jajfkldjal";
    }
}
