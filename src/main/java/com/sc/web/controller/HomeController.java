package com.sc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index")
	public String index(Model model) {
		return "home.index";
	}
	
	@RequestMapping("/help")
	public String help(Model model) {
		return "home.help";
	}
}
