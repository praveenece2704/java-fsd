package com.example.Mapping.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	private int uid;
	private String uname;
	private String feedbacks;
	private String rating;
	private String comments;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(int uid, String uname, String feedbacks, String rating, String comments) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.feedbacks = feedbacks;
		this.rating = rating;
		this.comments = comments;
	}
	

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(String feedbacks) {
		this.feedbacks = feedbacks;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Feedback [uid=" + uid + ", uname=" + uname + ", feedbacks=" + feedbacks + ", rating=" + rating
				+ ", comments=" + comments + "]";
	}

	
}
	
