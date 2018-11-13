package com.sevice.menu.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

	@Secured("ROLE_USER")
	@RequestMapping("/menu")
	public String menu(){
		return "menu/menu";
	}
}
