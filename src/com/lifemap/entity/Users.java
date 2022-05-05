package com.lifemap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="pwd")
	private String pwd;
	
	

	@OneToMany(fetch=FetchType.LAZY,
			   mappedBy="users",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<Branches> branches;



	public Users() {
		
	}



	public Users(int id, String login, String pwd) {
		
		this.id = id;
		this.login = login;
		this.pwd = pwd;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public List<Branches> getBranches() {
		return branches;
	}



	public void setBranches(List<Branches> branches) {
		this.branches = branches;
	}



	@Override
	public String toString() {
		return "Users [id=" + id + ", login=" + login + ", pwd=" + pwd + "]";
	}
	
	
	
	
}




