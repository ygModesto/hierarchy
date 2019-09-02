package com.mapstruct.issue.hierarchy.to;

public class UserTO extends UserBaseTO {
	
	
	private String name;
	private String login;
	
	
	public UserTO() {
	}
	
	public UserTO(Long userId, String name, String login) {
		super(userId);
		this.name = name;
		this.login = login;
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
