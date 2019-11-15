package com.harryst;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by harryhx on 2019/11/15.
 */
@Configuration
public class LoggerConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }
}
