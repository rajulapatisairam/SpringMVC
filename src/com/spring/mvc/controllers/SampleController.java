package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	@RequestMapping("/java4s")
	public ModelAndView helloWorld() {
	 
	   String message =  "Welcome to Java4s.com Spring MVC 3.2.x Sessions";
	   message += "<br>You Did it....!";
	 System.out.println(" in controlelr Class");
	   return new ModelAndView("welcomePage", "welcomeMessage", message);
	}//ModelAndView closed
}
