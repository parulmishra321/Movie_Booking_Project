package com.movies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int User_id;

	@Column(name = "Name")
	private String User_name;
	@Column(name = "Password")
	private String User_Password;
	@Column(name = "Contact")
	private String User_Pno;
	@Column(name = "Email")
	private String User_email;
	@Column(name = "Gender")
	private String Gender;
	

	//	public User(String User_Password, String user_fname, String user_lname, int user_Pno, String user_email) {
//		
//		User_Password = User_Password;
//		User_fname = user_fname;
//		User_lname = user_lname;
//		User_Pno = user_Pno;
//		User_email = user_email;
//	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getUser_Password() {
		return User_Password;
	}
	public void setUser_Password(String User_Password) {
		this.User_Password = User_Password;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	
	public String getUser_Pno() {
		return User_Pno;
	}
	public void setUser_Pno(String user_Pno) {
		User_Pno = user_Pno;
	}
	public String getUser_email() {
		return User_email;
	}
	public void setUser_email(String user_email) {
		User_email = user_email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}
