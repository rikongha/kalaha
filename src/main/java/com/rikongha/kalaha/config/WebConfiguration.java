package com.rikongha.kalaha.config;

import com.rikongha.kalaha.config.interceptor.PlayerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    private final PlayerInterceptor createPlayerInterceptor;

    public WebConfiguration(PlayerInterceptor createPlayerInterceptor) {
        this.createPlayerInterceptor = createPlayerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(createPlayerInterceptor);
    }

}
