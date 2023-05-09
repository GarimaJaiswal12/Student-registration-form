package org.ncu.Studentregistrationapp.controller;


import javax.validation.Valid;

import org.ncu.Studentregistrationapp2.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@ModelAttribute("user")
	public User getUser() {
		return new  User();
}
//return view for registration
	@RequestMapping(value= "/register")
	public String showRegistration() {
		return "register-form";
	}
	//return view for 
	@RequestMapping(value="/display")
	public String displayform(@Valid @ModelAttribute("user")User user, BindingResult bindingResult) {
		System.out.println("User name:" +user.getName()+"password>:"+user.getPassword());{
			if(bindingResult.hasErrors()) {
				System.out.println("register");
				return "register-form";
			}else {
				System.out.println("display");
				return "display-form";
			}
		}

	}
}