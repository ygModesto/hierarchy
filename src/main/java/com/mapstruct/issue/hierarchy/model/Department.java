package com.mapstruct.issue.hierarchy.model;

import java.util.Collection;

public class Department {
	
	private Long departmentId;
	private String name;
	
	Collection<User> users;
	
	
	private Department() {
	}
	
	private Department(Long departmentId, String name) {
		this.departmentId = departmentId;
		this.name = name;
	}
	
	private Department(Long departmentId, String name, Collection<User> users) {
		this.departmentId = departmentId;
		this.name = name;
		this.users = users;
	}
	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long userId) {
		this.departmentId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	

}
