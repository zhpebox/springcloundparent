package com.springcloud.test.providetwo;


import com.springcloud.test.providetwo.config.OneIntercepter;
import com.springcloud.test.providetwo.config.TwoIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class UserIntercepter extends WebMvcConfigurerAdapter {

    /**
     * 重写增加自定义拦截器的注册，某一个拦截器需要先注册进来，才能工作
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new OneIntercepter()).addPathPatterns("/nbook/**");
        registry.addInterceptor(new TwoIntercepter()).addPathPatterns("/nbook/**").addPathPatterns("/testRest/**");

        super.addInterceptors(registry);

    }
}
