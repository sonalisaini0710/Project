package com.nagarro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author kanikamahajan01
 *
 */
@Entity
@Table(name="users")
public class Users {
	@Id
	String uname;
	@Column(name="pass")
	String pass;
	
	public Users(){}
	public Users(String uname, String pass) {
		
		this.uname = uname;
		this.pass = pass;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
