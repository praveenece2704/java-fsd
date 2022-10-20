package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AdminLogin;
import com.example.model.ApplicationDetails;
import com.example.model.DeathDetails;
import com.example.repository.AdminRepository;
import com.example.repository.ApplicationRepository;
import com.example.repository.DeathRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class AdminController {
	
	
	@Autowired
	AdminRepository arepo;
	
	@Autowired
	ApplicationRepository aprepo;
	
	@Autowired
	DeathRepository drepo;
	
	@PostMapping("adminlogin")
	public String adminlogin(@RequestBody AdminLogin a)
	{
		String username=a.getUsername();
		String password=a.getPassword();
		System.out.println(arepo.findById(username)+" "+arepo.findByPassword(password));
		if(username!=null && password!=null)
		{
			if(arepo.findById(username).equals(arepo.findByPassword(password)))
					{
				        return "Login Successful";
					}
			else
			{
				return "Oops Username or password incorrect";
			}
		}
		else
		{
			return "Please enter the valid details";
		}
	}
	
	@GetMapping("showdetails")
	public List<ApplicationDetails> showAll()
	{
		return aprepo.findAll();
	}
	
	@GetMapping("showdeathdetails")
	public List<DeathDetails> showdeath()
	{
		return drepo.findAll();
	}
	
	@GetMapping("notApprovedStatus")
	public List<Object> viewstatus()
	{
		return aprepo.findByStatus();
	}

}
