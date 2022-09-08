package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.UserRepo;
import com.example.bean.User;

@RestController
public class UserController {
	
	@Autowired 
	UserRepo urepo;
	
	@ResponseBody
	@RequestMapping("/login")
	public String validate(@RequestBody User u)
	{
		int userid=u.getUserid();
		String username=u.getUsername();
		String password=u.getPassword();
		String val="";
		if((urepo.findById(userid)!=null)&&(urepo.findByName(username)!=null)&&(urepo.findByPassword(password)!=null))
		{
		if(urepo.findByName(username).equals(urepo.findByPassword(password)))
		{
			val= "You already attempted the quiz !!!";
			
		}
		}
		else
		{
			urepo.save(u);
			val= "Welcome to quiz portal\n To see the quizes go to /allquizes";
		}	
		
		return val;
	}
	
	

}
