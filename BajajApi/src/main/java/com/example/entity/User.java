package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	private String is_success;
	@Id
	private String userid;
	private String email_id;
	private String roll_number;
	private String alphabets;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String status, String userid, String email_id, String roll_number, String alphabets) {
		super();
		this.is_success = status;
		this.userid = userid;
		this.email_id = email_id;
		this.roll_number = roll_number;
		this.alphabets = alphabets;
	}
	public String getStatus() {
		return is_success;
	}
	public void setStatus(String status) {
		this.is_success = status;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	public String getAlphabets() {
		return alphabets;
	}
	public void setAlphabets(String alphabets) {
		this.alphabets = alphabets;
	}
	
	
	

}
