package org.ncu.Studentregistrationapp.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class inputFormHandler {
	@RequestMapping(value = "/input")
public String getInputForm() {
	return "Input-form";
}
	
	@RequestMapping(value = "/process")
	public String processInputForm(HttpServletRequest request, Model model) {
	String name= request.getParameter("username");
	String pass= request.getParameter("userPass");
	name= "Mr. "+ name.toUpperCase();
	System.out.println("Name: "+name);
	model.addAttribute("changedName", name);
	
	return "process-form";
	}

	
	}
	