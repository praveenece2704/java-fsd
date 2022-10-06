package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeleniumController {

	@RequestMapping("show")
	public String show()
	{
		return "demo";
	}
}
