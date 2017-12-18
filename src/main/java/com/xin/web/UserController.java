package com.xin.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xin.model.User;
import com.xin.service.UserService;

@Controller
public class UserController {
	 @Resource  
	 private UserService userService; 
	
	@RequestMapping(value="/user", method = GET)
	public @ResponseBody User getUser(@RequestParam(value="name") String name){
		User user = new User();
		user.setName(name);
		user.setPasswd("aaaaaaaaaaa");
		return user;
	}

	@RequestMapping(value="/getUser", method = GET)
	public @ResponseBody User getUser(){
		User user = userService.selectUserById(1); ;
		return user;
	}
}
