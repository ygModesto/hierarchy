package com.mapstruct.issue.hierarchy.to;

import java.util.Collection;

public class DepartmentTO extends DepartmentBaseTO {
	
	
	private String name;
	private Collection<UserBaseTO> users;
	
	
	public DepartmentTO() {
	}
	
	public DepartmentTO(Long departmentId, String name) {
		super(departmentId);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Collection<UserBaseTO> getUsers() {
		return users;
	}

	public void setUsers(Collection<UserBaseTO> users) {
		this.users = users;
	}
	
	

}
