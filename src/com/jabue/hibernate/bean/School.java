package com.jabue.hibernate.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * School entity. @author MyEclipse Persistence Tools
 */

public class School implements java.io.Serializable {

	// Fields

	private String school;
	private Integer sdutdentsnumber;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public School() {
	}

	/** minimal constructor */
	public School(String school, Integer sdutdentsnumber) {
		this.school = school;
		this.sdutdentsnumber = sdutdentsnumber;
	}

	/** full constructor */
	public School(String school, Integer sdutdentsnumber, Set users) {
		this.school = school;
		this.sdutdentsnumber = sdutdentsnumber;
		this.users = users;
	}

	// Property accessors

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getSdutdentsnumber() {
		return this.sdutdentsnumber;
	}

	public void setSdutdentsnumber(Integer sdutdentsnumber) {
		this.sdutdentsnumber = sdutdentsnumber;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}