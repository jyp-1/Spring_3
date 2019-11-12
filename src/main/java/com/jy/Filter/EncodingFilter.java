package com.jy.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class EncodingFilter
 */
public class EncodingFilter implements Filter {
	
	private String encode;
    /**
     * Default constructor. 
     */
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// 필터 객체가 종료 될때 한번 실행하는 것
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//request가 발생시 실행하는 구간 
		request.setCharacterEncoding(this.encode);
		response.setCharacterEncoding(this.encode);
		System.out.println("Filter In");
		
		chain.doFilter(request, response);
		
		System.out.println("Filter OUT");
		//response 발생시 실행하는 구간 
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// 객체가 생성되고 난 후 딱 한번 실행하는 초기화 매서드
		this.encode= fConfig.getInitParameter("encode");
		
	}

}
