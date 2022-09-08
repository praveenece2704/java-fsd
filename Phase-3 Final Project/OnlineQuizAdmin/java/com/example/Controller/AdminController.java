package com.example.Controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Repository.AdminRepo;
import com.example.Repository.OperationRepo;
import com.example.Repository.QuestionRepo;
import com.example.Repository.ScoreRepo;
import com.example.Repository.StandingRepo;
import com.example.Repository.UserRepo;
import com.example.Repository.quizRepo;
import com.example.bean.Admin;
import com.example.bean.Question;
import com.example.bean.Quiz;
import com.example.bean.Standings;
import com.example.bean.User;

@RestController
public class AdminController {
	
	@Autowired
	AdminRepo erepo;
	
	@Autowired
	OperationRepo orepo;
	
	@Autowired
	quizRepo qrepo;
	
	@Autowired
	QuestionRepo Quesrepo;
	
	@Autowired
	ScoreRepo srepo;
	
	@Autowired
	StandingRepo sarepo;
	
	@Autowired
	UserRepo urepo;
	
	@ResponseBody
	@RequestMapping("/admin/validate")
	public String validate(@RequestBody Admin a)
	{
		String username=a.getUsername();
		String password=a.getPassword();
		String val="";
		if((erepo.findByName(username)!=null)&&(erepo.findByPassword(password)!=null))
		{
		if(erepo.findByName(username).equals(erepo.findByPassword(password)))
		{
			System.out.println(erepo.findByName(username));
			System.out.println(erepo.findByPassword(password));
			val= "Successfully Logged In \n If y want to change password go to /changepassword \n To insert the questions TYPE /insertquestion"
					+ "\n To get all Quizes TYPE /allquizes \n To get quiz by quiz id TYPE /getbyquizid/{id} \n"
					+ " To get question by question id TYPE /getbyquestionid/{id}";
			
		}
		}
		else
		{
			val= "Oops Please enter the valid username and password";
		}	
		
		return val;
	}
	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	@PutMapping("/changepassword")
	public String changepassword(@RequestBody Admin a)
	{
		erepo.save(a);
		return "Updated Successfully \n To see the quizes TYPE /allquizes \n To insert the questions TYPE /insertquestion "
				+ "\n To get all Quizes TYPE /allquizes \n To get quiz by quiz id TYPE /getbyquizid/{id} \n "
				+ "To get question by question id TYPE /getbyquestionid/{id} "
				+ "To see the scores of all the users TYPE /score\n"
				+ "To see the position of all the users TYPE /position \n"
				+ "To see the all the user details who attended the quiz TYPE /users";
		
	}
	
	@RequestMapping("/allquizes")
	public List<Quiz> show()
	{
		return qrepo.findAll();
	}
	
	@PostMapping("/insertquestion")
	public Question insert(@RequestBody Question q)
	{
		log.info("{}",q);
		return orepo.save(q);
	}
	
	@PostMapping("/insertquiz")
	public Quiz insert(@RequestBody Quiz q)
	{
		log.info("{}",q);
		return qrepo.save(q);
	}
	
	
	@GetMapping("/getbyquizid/{id}")
	public Quiz quiz(@PathVariable("id") int id)
	{
		
		Quiz  q= qrepo.findById(id).orElse(null);
		return q;
	}
	
	
	@GetMapping("/getbyquestionid/{id}")
	public Question question(@PathVariable("id") int id)
	{
		
		Question  q= Quesrepo.findById(id).orElse(null);
		return q;
	}
	
	@RequestMapping("/score")
	public List<Standings> find()
	{		
		List<Standings> s1=sarepo.findAll();
		return s1;
	}
	@RequestMapping("/position")
	public List<Standings> position()
	{
		return sarepo.findByPos();
	}
	
	@RequestMapping("/users")
	public List<User> user()
	{
		return urepo.findAll();
	}
	
	@RequestMapping("/userlogin")
	public void userdetails()
	{
		String uri = "http://localhost:8081/login";
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.getForObject(uri, String.class);
	}
	
	@RequestMapping("/findallquizes")
	public void userdemo()
	{
		String uri = "http://localhost:8081/allquizes";
	    RestTemplate restTemplate = new RestTemplate();
	    restTemplate.getForObject(uri, String.class);
	}

//	@RequestMapping("/login/allquizes")
//	public List<Quiz> allquizes()
//	{
//		return qrepo.findAll();
//	}
//	
//	@RequestMapping("/login/allquizes/{id}")
//	public Optional<Quiz> allquestionbyid(@PathVariable int id)
//	{
//		return qrepo.findById(id);
//	}

}
