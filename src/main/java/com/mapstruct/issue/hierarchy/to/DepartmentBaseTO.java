package com.mapstruct.issue.hierarchy.to;

public class DepartmentBaseTO {
	
	private Long departmentId;
	
	
	public DepartmentBaseTO() {
	}
	
	public DepartmentBaseTO(Long userId) {
		this.departmentId = userId;
	}
	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	

}
