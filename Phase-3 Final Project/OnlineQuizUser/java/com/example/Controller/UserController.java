package com.example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.QuestionRepo;
import com.example.Repository.ScoreRepo;
import com.example.Repository.StandingRepo;
import com.example.Repository.UserRepo;
import com.example.Repository.quizRepo;
import com.example.bean.Question;
import com.example.bean.Quiz;
import com.example.bean.Score;
import com.example.bean.Standings;
import com.example.bean.User;

@RestController
public class UserController {
	
	@Autowired 
	UserRepo urepo;
	
	@Autowired
	quizRepo qrepo;
	
	@Autowired
	QuestionRepo quesrepo;
	
	@Autowired
	ScoreRepo srepo;
	
	@Autowired
	StandingRepo sarepo;
	
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
			val= "Welcome to quiz portal \n To see all the quizes go to /allquizes\n"
					+ "To see all questions in the particular quiz id TYPE /quiz/{id}\n"
					+ "To answer the questions TYPE /quiz/answer\n"
					+ "To see the score TYPE /score/{id}\n"
					+ "To see the Standing/position TYPE /position\n";
		}	
		
		return val;
	}
	
	@RequestMapping("/allquizes")
	public List<Quiz> allquizes()
	{
		return qrepo.findAll();
	}
	
	@RequestMapping("/quiz/{id}")
	public Optional<Quiz> allquestionbyid(@PathVariable int id)
	{
		return qrepo.findById(id);
	}
	
	@RequestMapping("/quiz/answer")
	public String answer(@RequestParam(name="userid") int userid,
			@RequestParam(name="username") String username,
			@RequestParam(name="answer") String ans,
			@RequestParam(name="qid") int questionid)
	{
		String val;
		
		Question q=quesrepo.findById(questionid).orElse(null);
		System.out.println(q);
	    Question q1=quesrepo.findByAnswer(ans);
	    System.out.println(q1);
	    Score s=new Score();
	    if(q.equals(q1))
	    {
	    	val="correct answer";	
	    	s.setCorrect(1);
	    	s.setWrong(0);
	    	s.setUserid(userid);
	    	s.setUsername(username);
	    	s.setQid(questionid);
	    	srepo.save(s);
	    	
	    }
	    else
	    {
	    	s.setCorrect(0);
	    	s.setWrong(1);
	    	s.setUserid(userid);
	    	s.setUsername(username);
	    	s.setQid(questionid);
	    	srepo.save(s);
	    	val="wrong answer";
	    }
	    return val;
	}
	
	@RequestMapping("score/{id}")
	public Standings find(@PathVariable("id") int uid)
	{
		Standings s=new Standings();
		int score= srepo.findByCorrect(uid);
		s.setUserid(uid);
		s.setScore(score);
		sarepo.save(s);
		System.out.println(s);
		Standings s1=sarepo.findById(uid).orElse(null);
		return s1;
	}
	@RequestMapping("/position")
	public List<Standings> position()
	{
		return sarepo.findByPos();
	}

}
