package com.edu.part7;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterOne implements Filter {

	@Override
	public void destroy() {
		System.out.println("destroy() 호출 ... one");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Before doFilter() 호출 ... one");
		chain.doFilter(request, response);
		System.out.println("After doFilter() 호출 ... one");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init() 호출 ... one");

	}

}
