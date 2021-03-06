package com.emaus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("home")
	public String home() {
		return "index";
	}
	
	@GetMapping("list")
	public String listar() {
		return "/hermano/list";
	}
	@GetMapping("insert")
	public String insert() {
		return "/hermano/insert";
	}
	
}
