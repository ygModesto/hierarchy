package com.mapstruct.issue.hierarchy.model;

public class User {
	
	private Long userId;
	private String name;
	private String login;
	
	
	private User() {
	}
	
	private User(Long userId, String name, String login) {
		this.userId = userId;
		this.name = name;
		this.login = login;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	

}
