package com.example.SearchAndUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public String index()
	{
		return "index";
	}
	
	@Autowired
	UserDao udao;
	
	@RequestMapping("addUsers")
	public String addUsers(UserD u)
	{
		udao.save(u);
		return "welcome";
	}
	
	
//	@RequestMapping("displayUsers")
//	public ModelAndView displayUsers(@RequestParam int id)
//	{
//		System.out.println(id);
//		ModelAndView mav=new ModelAndView("show");
//		UserD user=udao.findById(id).orElse(new UserD());
//		mav.addObject("userdetails",user);
//		return mav;
//	}
	
	@RequestMapping("displayUsers")
	public ModelAndView displayUsers(@RequestParam int id)
	{
		System.out.println(id);
		ModelAndView mav=new ModelAndView("show");
		UserD user=udao.findById(id).orElse(new UserD());
		mav.addObject("userdetails",user);
		return mav;
	}
	@RequestMapping("deleteUsers")
	public ModelAndView deleteUsers(@RequestParam int id)
	{
		System.out.println(id);
		ModelAndView mav=new ModelAndView("delete");
		UserD user=udao.findById(id).orElse(new UserD());
		udao.deleteById(id);
		mav.addObject("userdetails",user);
		return mav;
	}
	@RequestMapping("updateUsers")
	public ModelAndView updateUsers(@RequestParam int id)
	{
		System.out.println(id);
		ModelAndView mav=new ModelAndView("update");
		UserD user=udao.findById(id).orElse(new UserD());
		udao.deleteById(id);
		mav.addObject("userdetails",user);
		return mav;
	}
}
