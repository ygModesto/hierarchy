package com.mapstruct.issue.hierarchy.to;

public class UserBaseTO {
	
	private Long userId;
	
	
	public UserBaseTO() {
	}
	
	public UserBaseTO(Long userId) {
		this.userId = userId;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
