package com.lifemap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "short_desc")
	private String shortDesc;

	@Column(name = "long_desc")
	private String longDesc;

	@Column(name = "urgency_level")
	private int urgencyLevel;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "branch_id")
	private Branches branch;

	public Tasks() {

	}

	

	public Tasks(Branches branch, String shortDesc ) {
		this.branch = branch;
		this.shortDesc = shortDesc;
		
	}


	public Tasks(Branches branch, String shortDesc, String longDesc) {
		this.branch = branch;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}

	


	public Tasks(Branches branch, String shortDesc, int urgencyLevel) {
		
		this.branch = branch;
		this.shortDesc = shortDesc;
		this.urgencyLevel = urgencyLevel;
	}

	


	public Tasks(Branches branch, String shortDesc, String longDesc, int urgencyLevel) {
		super();
		this.branch = branch;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.urgencyLevel = urgencyLevel;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	public int getUrgencyLevel() {
		return urgencyLevel;
	}

	public void setUrgencyLevel(int urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}

	public Branches getBranch() {
		return branch;
	}

	public void setBranch(Branches branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + ", urgencyLevel="
				+ urgencyLevel + "]";
	}
	
	

}
