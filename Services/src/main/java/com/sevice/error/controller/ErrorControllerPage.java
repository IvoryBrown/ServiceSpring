package com.sevice.error.controller;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorControllerPage  implements ErrorController {
private static final String ERR_PATH = "/error";
	
	
	@RequestMapping(ERR_PATH)
	public String error() {
		
		return "error/errorpage";
	}

	@Override
	public String getErrorPath() {
		return ERR_PATH;
	}
}
