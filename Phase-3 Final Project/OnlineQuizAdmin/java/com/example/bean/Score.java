package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Score {
	
	@Id 
	@GeneratedValue
	private int scoreid;
	private int userid;
	private String username;
	private int qid;
	private int correct;
	private int wrong;
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(int scoreid, int userid, String username, int qid, int correct, int wrong) {
		super();
		this.scoreid = scoreid;
		this.userid = userid;
		this.username = username;
		this.qid = qid;
		this.correct = correct;
		this.wrong = wrong;
	}
	@Override
	public String toString() {
		return "Score [scoreid=" + scoreid + ", userid=" + userid + ", username=" + username + ", qid=" + qid
				+ ", correct=" + correct + ", wrong=" + wrong + "]";
	}
	public int getScoreid() {
		return scoreid;
	}
	public void setScoreid(int scoreid) {
		this.scoreid = scoreid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct = correct;
	}
	public int getWrong() {
		return wrong;
	}
	public void setWrong(int wrong) {
		this.wrong = wrong;
	}
	

}
