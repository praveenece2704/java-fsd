package com.example.Mapping.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.Mapping.Repository.FeedbackRepository;
import com.example.Mapping.bean.Feedback;


@Controller
public class FeedbackController {
	
	@Autowired
	FeedbackRepository feedRep;
	
	@RequestMapping("view")
	public String view()
	{
		return "demo";
	}
	

	@RequestMapping(value = "link", method = RequestMethod.POST)
	public String createEmployee(@RequestParam int uid,@RequestParam String uname,@RequestParam String feedbacks,@RequestParam String rating,@RequestParam String ename) {
		//Feedback fb=new Feedback(cid,cname,feedbacks,rating,ename);
		feedRep.save(new Feedback(uid,uname,feedbacks,rating,ename));
		return "show";
	}
}



//@RequestMapping("goto")
//public String mapit(Feedback fb)
//{
//	feedRep.save(fb);
//	return "show";
//	
//}
//@RequestMapping(value = "/link/{cid}/{cname}/{feedbacks}/{rating}/{ename}}",method = RequestMethod.POST)
//public String link(@ModelAttribute("cid") int CustomerId,@ModelAttribute("cname") String CustomerName,@ModelAttribute("feedbacks") String feedbacks,@ModelAttribute("rating") String rating,@ModelAttribute("ename") String ecommerceName)
//{
//	Feedback fb=new Feedback(CustomerId,CustomerName,feedbacks,rating,ecommerceName);
//	feedRep.save(fb);
//	return "show";
//}