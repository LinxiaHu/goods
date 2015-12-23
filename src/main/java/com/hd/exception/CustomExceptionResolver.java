package com.hd.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import sun.security.x509.EDIPartyName;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {

		// 解析出异常类型，如果是系统自定义异常，则取出，在错误页面显示
		// String message = null;
		// if (ex instanceof CustomException) {
		// message = ((CustomException)ex).getMessage();
		// } else {
		// // 如果不是系统自定义异常，则构造一个系统自定义异常（信息为“未知错误”）
		// }

		CustomException customException = null;
		if (ex instanceof CustomException) {
			customException = (CustomException) ex;
		} else {
			// 如果不是系统自定义异常，则构造一个系统自定义异常（信息为“未知错误”）
			customException = new CustomException("未知错误信息");
		}
		
		String message = customException.getMessage();
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message", message);
		
		// 指向错误页面
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
