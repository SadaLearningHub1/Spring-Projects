package com.sadalearninghub.Interceptor;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CounterInterceptor extends HandlerInterceptorAdapter {
	private AtomicInteger counter = new AtomicInteger(0);

    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.setAttribute("count", counter.incrementAndGet());
        return true;
    }

}
