package com.hd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hd.service.UserService;
import com.hd.service.impl.UserServiceImpl;
import com.hd.ssm.pojo.UserCustom;

/**
 * Created by Chunyun on 2015/11/3.
 */

@Controller
public class UserController {

	@Autowired(required = false) @Qualifier("userService")
	private UserService userService;

	@RequestMapping(value = "/queryUser.action", method = { RequestMethod.POST,
			RequestMethod.GET })
	public ModelAndView queryUser() throws Exception {

		List<UserCustom> userList = userService.findUserList(null);

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("userlist", userList);

		modelAndView.setViewName("user/userList");

		return modelAndView;

	}
}
