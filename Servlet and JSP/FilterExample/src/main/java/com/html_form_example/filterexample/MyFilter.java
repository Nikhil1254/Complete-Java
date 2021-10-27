package com.html_form_example.filterexample;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //we can access FilterConfig object here , which web container will provide
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //preprocessing - Before servlet
        System.out.println("Before servlet - Preprocessing...");
        //......
        //......
        //......
        chain.doFilter(request, response); //request is forwarded to servlet
        //postprocessing work - After servlet
        System.out.println("After Servlet - Postprocessing...");
        //........
        //........
        //........
    }

    @Override
    public void destroy() {
    }

}
