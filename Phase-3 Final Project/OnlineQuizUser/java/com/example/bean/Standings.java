package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Standings {
	
	@Id
	private int userid;
	private int score;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Standings [userid=" + userid + ", score=" + score + "]";
	}
	public Standings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Standings(int userid, int score) {
		super();
		this.userid = userid;
		this.score = score;
	}
	
	

}
