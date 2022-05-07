package com.demo.satokendemo.service.impl;

import cn.dev33.satoken.interceptor.SaAnnotationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/5/7 16:21
 */
@Configuration
//在高版本 SpringBoot (≥2.6.x) 版本下，需要额外添加 @EnableWebMvc 注解才可以使注册拦截器生效。
@EnableWebMvc
public class SaTokenConfigure implements WebMvcConfigurer {

    /**
     *注册Sa-Token的注解拦截器，打开注解式鉴权功能
     *
     * @param ""
     *@author Administrator
     *@date 2022/5/7 16:26
     *@return
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册注解拦截器，并排除不需要注解鉴权的接口地址 (与登录拦截器无关)
        registry.addInterceptor(new SaAnnotationInterceptor()).addPathPatterns("/**");
    }
}