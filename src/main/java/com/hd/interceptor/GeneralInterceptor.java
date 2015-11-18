package com.hd.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hd.service.UserService;
import com.hd.ssm.pojo.User;
import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;

public class GeneralInterceptor implements HandlerInterceptor {

	private String[] exel = {"Login.action"};
	@Autowired
	private UserService userService;
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		boolean flag = false;
		System.out.println("通用拦截器1");
		String url = request.getRequestURL().toString();
		System.out.println(url);
		for(String s : exel) {
			if(url.contains(s)) {
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			UserCustom uc = (UserCustom) request.getSession().getAttribute("uc");
			if(null != uc) {
				flag = true;
			}else {
				request.getRequestDispatcher("/WEB-INF/jsp/user/login.jsp").forward(request, response);
			}
		}
		return flag;
		
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
