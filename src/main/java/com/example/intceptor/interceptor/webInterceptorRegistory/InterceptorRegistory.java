package com.example.intceptor.interceptor.webInterceptorRegistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.intceptor.interceptor.intercepter.UMInterceptor;

@SuppressWarnings("deprecation")
@Component
public class InterceptorRegistory extends WebMvcConfigurerAdapter {
   @Autowired
   UMInterceptor umInterceptor;

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(umInterceptor);
   }
}