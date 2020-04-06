package com.great.kindergarten.rector.interceptor;

import com.great.kindergarten.admin.interceptor.kindergartenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * 设置哪些不需要拦截实现类
 */
@Configuration
public class RectorLoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new kindergartenInterceptor());
        interceptorRegistration.addPathPatterns("/**");
        interceptorRegistration.excludePathPatterns(
                "/**/*.jsp","/image/**","/js/**","/layui/**","/mainres/**","/personalres/**","/video/**"
        );
    }
}
