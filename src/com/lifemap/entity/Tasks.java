package com.lifemap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="branch_id")
	private int BranchId;

	@Column(name="short_desc")
	private String shortDesc;
	
	@Column(name="long_desc")
	private String longDesc;
	
	@Column(name="urgency_level")
	private byte urgencyLevel;

	public Tasks() {
		
	}

	public Tasks(int branchId, String shortDesc) {
		super();
		BranchId = branchId;
		this.shortDesc = shortDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBranchId() {
		return BranchId;
	}

	public void setBranchId(int branchId) {
		BranchId = branchId;
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

	public byte getUrgencyLevel() {
		return urgencyLevel;
	}

	public void setUrgencyLevel(byte urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", BranchId=" + BranchId + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc
				+ ", urgencyLevel=" + urgencyLevel + "]";
	}
	
	
	
	
}
