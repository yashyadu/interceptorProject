package com.example.intceptor.interceptor.intercepter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class UMInterceptor implements HandlerInterceptor {
   @Override
   public boolean preHandle
      (HttpServletRequest request, HttpServletResponse response, Object handler) 
      throws Exception {
      // Write Request Filter Here 
      System.out.println("Pre-Hander Called | Write Authentication Code Here");
      response.setHeader("Invalid", "Invalid");
      
      String text = "{\"a\":\"abc\"}";
      // fasdfbdsa 
      
      //getters and setter

      response.setContentType("application/json");  
      response.setCharacterEncoding("UTF-8"); 
      response.getWriter().write(text); 
      return false;
   }
   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, 
      Object handler, ModelAndView modelAndView) throws Exception {
      
      System.out.println("Post-Handeler | If you want to filter Response Param");
   }
   @Override
   public void afterCompletion
      (HttpServletRequest request, HttpServletResponse response, Object 
      handler, Exception exception) throws Exception {
      
      System.out.println("After Request Response Called This line is for final Execution");
   }
}