package com.hjn.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hjn.entity.SysAccount;
import com.hjn.exception.CustomException;
import com.hjn.service.SysAccountService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	private static final Logger log4j = Logger.getLogger(AdminController.class);
	
	@Resource
	private SysAccountService sysAccountService;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginForm(){
		
		return "admin/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(String loginName, String password) throws CustomException{
		sysAccountService.login(loginName, password);
		return "user/list";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String registerForm(){
		return "admin/register";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(SysAccount sysAccount){
		sysAccountService.register(sysAccount);
		return "login";
	}
}
