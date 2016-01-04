package com.hd.pager;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hd.ssm.pojo.UserCustom;

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		boolean flag = false;
		System.out.println("通用过滤器1");
		String url = req.getRequestURL().toString();
		System.out.println(url);
		

		if (!flag) {
			UserCustom uc = (UserCustom) req.getSession()
					.getAttribute("uc");
			if (null != uc) {
				flag = true;
				chain.doFilter(request, response);
			} else {
				request.getRequestDispatcher("/WEB-INF/jsp/user/login.jsp")
						.forward(request, response);
			}
		}
	}

	@Override
	public void destroy() {

	}

}
