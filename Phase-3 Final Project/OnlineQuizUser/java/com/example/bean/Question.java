package com.example.bean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Question {
	@Id
	private int qid;
	private String qname;
	private String qoption1;
	private String qoption2;
	private String qoption3;
	private String qoption4;
	private String answer;
	@ManyToOne()
	private Quiz quizid;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getQoption1() {
		return qoption1;
	}
	public void setQoption1(String qoption1) {
		this.qoption1 = qoption1;
	}
	public String getQoption2() {
		return qoption2;
	}
	public void setQoption2(String qoption2) {
		this.qoption2 = qoption2;
	}

	public String getQoption3() {
		return qoption3;
	}

	public void setQoption3(String qoption3) {
		this.qoption3 = qoption3;
	}

	public String getQoption4() {
		return qoption4;
	}

	public void setQoption4(String qoption4) {
		this.qoption4 = qoption4;
	}

//	public String getAnswer() {
//		return answer;
//	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

//	public Quiz getQuizid() {
//		return quizid;
//	}

	public void setQuizid(Quiz quizid) {
		this.quizid = quizid;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname+"]";
	}

	public Question(int qid, String qname, String qoption1, String qoption2, String qoption3, String qoption4,
			String answer, Quiz quizid) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.qoption1 = qoption1;
		this.qoption2 = qoption2;
		this.qoption3 = qoption3;
		this.qoption4 = qoption4;
		this.answer = answer;
		this.quizid = quizid;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
