package com.example.demo.shiroutil;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class SessionInterceptor implements  HandlerInterceptor{

	//第三个
	public  void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable Exception ex) throws Exception {
		System.out.println("afterCompletion");
	}
	
	//第二个
	public  void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
	}
	 
	
	//首先拦截到所有请求
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
		System.out.println("preHandle");
		return true;
	}
}
