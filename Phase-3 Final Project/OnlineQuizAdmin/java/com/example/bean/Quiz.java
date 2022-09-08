package com.example.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Quiz {
	
	@Id
	private  int  quizid;
	private String quizname;
	
	@OneToMany(mappedBy="quizid")
	private List<Question> Question=new ArrayList<>();
	
	public Quiz() {
		super();
		
	}

	
	public int getQuizid() {
		return quizid;
	}

	public void setQuizid(int quizid) {
		this.quizid = quizid;
	}

	public String getQuizname() {
		return quizname;
	}

	public void setQuizname(String quizname) {
		this.quizname = quizname;
	}

//	public List<Question> getQuestion() {                   //hide this for insert 
//		return Question;
//	}

	public void addQuestion(Question question) {
		Question.add(question);
	}
	public void removeQuestion(Question question) {
		Question.remove(question);
	}

	@Override
	public String toString() {
		return "Quiz [quizid=" + quizid + ", quizname=" + quizname + ", Question=" + Question + "]";
	}

	public Quiz(int quizid, String quizname, List<com.example.bean.Question> question) {
		super();
		this.quizid = quizid;
		this.quizname = quizname;
		Question = question;
	}
	
}
