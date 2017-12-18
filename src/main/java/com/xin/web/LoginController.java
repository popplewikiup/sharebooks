package com.xin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class LoginController {
	@RequestMapping(value="/login")
	public String checkUser(@RequestParam String uname, @RequestParam String pswd) {
		if(uname.equals("abc")&&pswd.equals("abc")) {
			return "success";
		}
		return "error";
	}

}
