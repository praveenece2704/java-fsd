package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsertController {


	@RequestMapping("/retrieve")
	public ModelAndView displayretrieve(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String result=request.getParameter("id");
		mv.setViewName("display.jsp");
		mv.addObject("ID",result);
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView displayupdate(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("insert.jsp");
		return mv;
	}
}
