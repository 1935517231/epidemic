package com.example.epidemic.config;

import com.example.epidemic.Interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    private TokenInterceptor tokenInterceptor;

    //构造方法
    public InterceptorConfig(TokenInterceptor tokenInterceptor){
        this.tokenInterceptor = tokenInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        List<String> excludePath = new ArrayList<>();
        //登录
        excludePath.add("/");
        excludePath.add("/index.html");
        excludePath.add("/adminLogin.html");
        //没有设置excludePath.add("/static/**")来放行静态资源，是因为前端访问静态资源时没有加static/,
        //而是直接使用lib/**,或者images/等格式,所以添加下面这些格式的拦截
        excludePath.add("/lib/**");
        excludePath.add("/css/**");
        excludePath.add("/images/**");
        excludePath.add("/js/**");
        excludePath.add("/layui/**");
        excludePath.add("/api/**");
        //拦截是拦截controller，不用处理静态资源
        registry.addInterceptor(tokenInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(excludePath);
        //除了登陆接口其他所有接口都需要token验证
        WebMvcConfigurer.super.addInterceptors(registry);

    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");//
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
