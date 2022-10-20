package com.example.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ApplicationDetails;
import com.example.model.DeathDetails;
import com.example.model.Registration;
import com.example.model.UserLogin;
import com.example.repository.AdminRepository;
import com.example.repository.ApplicationRepository;
import com.example.repository.DeathRepository;
import com.example.repository.RegisterationRepository;
import com.example.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	AdminRepository adrepo;
	
	@Autowired
	ApplicationRepository aprepo;
	
	@Autowired
	RegisterationRepository regrepo;
	
	@Autowired
	UserRepository urepo;
	
	@Autowired
	DeathRepository drepo;

	@PostMapping("register")
	public String register(@RequestBody Registration r)
	{
		regrepo.save(r);
		return "Hi " + r.getName() + " your Registration process successfully completed";
	}
	
	@PostMapping("login")
	public String login(@RequestBody UserLogin u)
	{
		String email= u.getEmail();
		String password=u.getPassword();
		System.out.println(email+" "+password);
		if(email!=null && password !=null)
		{
			if(regrepo.findByEmail(email).equals(regrepo.findByPassword(password)))
			{
				urepo.save(u);
				return "Login Successfull";
			}
			else
			{
				return "Please Register before Login";
			}
		}
		else
		{
			return "Please enter the valid details";
		}
	}
	
	@PostMapping("appdetails")
	public String appdetails(@RequestBody ApplicationDetails app)
	{
		Random r=new Random();
		int randomnumber=r.nextInt(999999);
		String formatted=String.format("%05d", randomnumber);
		app.setCurrentStatus("Not Approved");
		app.setCitizenId(Integer.parseInt(formatted));
		app.setApplicationId(Integer.parseInt(formatted)/2);
		aprepo.save(app);
		return "Applied Successfully";
	}
	
    // for checking purpose from PostMan
	@GetMapping("getAllUsers")
	public List<Registration> getallusers()
	{
		return this.regrepo.findAll();
	}
	
	@GetMapping("getAllLogin")
	public List<UserLogin> getalllogin()
	{
		return urepo.findAll();
	}
	
	@GetMapping("getAppDetails/{email}")
	public Optional<ApplicationDetails> getalldetails(@PathVariable String email)
	{
		return aprepo.findById(email);
	}
	

	@PostMapping("updateAadhar")
	public String updateaadhar(@RequestBody ApplicationDetails a )
	{
		String email=a.getEmail();
		aprepo.deleteById(email);
		a.setCurrentStatus("Not Approved");
		aprepo.save(a);	
		return "Updated Successfully";
	}
	
	@GetMapping("applyDuplicate/{email}")
	public Optional<ApplicationDetails> applyduplicate(@PathVariable String email)
	{
		return aprepo.findById(email);
	}
	
	@GetMapping("viewStatus/{email}")
	public Optional<ApplicationDetails> viewstatus(@PathVariable String email)
	{
		System.out.println(email);
		return aprepo.findById(email);
		
	}
	
	
	@PostMapping("deathUpdate")
	public String deadthUpdate(@RequestBody DeathDetails data)
	{
		drepo.save(data);
		return "Aadhar cancellation Request is Submitted";
	}

}
