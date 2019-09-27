package com.movies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	
	@Id
	private String admin_user_Id;
	private String admin_password;
	
	
//	public Admin(int admin_id, String admin_name, String admin_user_Id, String admin_password) {
//		
//		this.admin_id = admin_id;
//		this.admin_name = admin_name;
//		this.admin_user_Id = admin_user_Id;
//		this.admin_password = admin_password;
//	}
	
	public String getAdmin_user_Id() {
		return admin_user_Id;
	}
	public void setAdmin_user_Id(String admin_user_Id) {
		this.admin_user_Id = admin_user_Id;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
	
}
