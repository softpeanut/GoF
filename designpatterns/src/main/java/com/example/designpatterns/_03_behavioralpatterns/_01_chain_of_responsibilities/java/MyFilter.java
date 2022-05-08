package com.example.designpatterns._03_behavioralpatterns._01_chain_of_responsibilities.java;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("환영합니다.");
        chain.doFilter(request, response);
        System.out.println("꽝");
    }
}
