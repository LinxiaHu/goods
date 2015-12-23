package com.hd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hd.service.UserService;
import com.hd.ssm.pojo.User;
import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;

/**
 * Created by Chunyun on 2015/11/3.
 */

@Controller
public class UserController {

	@Autowired(required = false)
	@Qualifier("userService")
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

	@RequestMapping(value = "/queryUserLogin.action", method = {
			RequestMethod.POST, RequestMethod.GET })
	public ModelAndView checkLoginUser(UserQueryVo vo,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		UserCustom user = userService.findCheckUserLogin(vo);

		if (request.getSession().getAttribute("uc") != null) {
			user = (UserCustom) request.getSession().getAttribute("uc");// 不加这行会使得登陆后在地址栏上按回车键退出到登陆界面
		} else {
			request.getSession().setAttribute("uc", user);
		}

		List<UserCustom> userList = userService.findUserList(null);// null表示查询出所有用户

		ModelAndView mv = new ModelAndView();

		if (null == user) {
			mv.addObject("user", user);
			mv.setViewName("user/login");
		} else {
			mv.addObject("userlist", userList);
			mv.setViewName("user/userList");
		}

		return mv;
	}

	@RequestMapping(value = "/queryUserInfo.action", method = RequestMethod.GET)
	public ModelAndView queryUserInfo(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView mv = new ModelAndView();

		mv.addObject("user", null);

		mv.setViewName("user/info");

		return mv;
	}

	@RequestMapping(value = "/updateUser.action", method = RequestMethod.GET)
	public ModelAndView updateUser(String id) throws Exception {

		ModelAndView mv = new ModelAndView();

		User user = userService.selectByPrimaryKey(id);

		UserCustom userCustom = new UserCustom();

		BeanUtils.copyProperties(user, userCustom);// 将user信息放入到扩展usercustom中

		mv.addObject("userCustom", userCustom);

		mv.setViewName("user/update");

		return mv;
	}

	@RequestMapping(value = "/updateSubmitUser.action", method = RequestMethod.POST)
	public ModelAndView updateSubmitUser(UserCustom userCustom,
			HttpServletRequest request) throws Exception {

		ModelAndView mv = new ModelAndView();

		User user = new User();

		BeanUtils.copyProperties(userCustom, user);

		String uid = user.getUid();

		User tmpUser = userService.selectByPrimaryKey(uid);

		// 判断传过来的user是否被改动过，若不改动则不执行update的sql语句
		if (!tmpUser.equals(user)) {
			int count = userService.updateByPrimaryKey(user);// 成功返回1

			if (count == 1) {
				List<UserCustom> userList = userService.findUserList(null);
				mv.addObject("userlist", userList);
				mv.setViewName("user/userList");
			} else {
				mv.addObject("userlist", null);
				mv.setViewName("user/errorUserUpdate");
			}
		} else { //若没有修改，则原样返回用户列表界面
			List<UserCustom> userList = userService.findUserList(null);
			mv.addObject("userlist", userList);
			mv.setViewName("user/userList");
		}

		return mv;
	}

}
