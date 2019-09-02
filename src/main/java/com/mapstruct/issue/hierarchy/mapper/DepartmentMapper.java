package com.mapstruct.issue.hierarchy.mapper;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mapstruct.issue.hierarchy.model.Department;
import com.mapstruct.issue.hierarchy.to.DepartmentTO;

@Mapper(uses = UserMapper.class)
public interface DepartmentMapper {

	DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
	
	
	DepartmentTO departmentToDepartmentTO(Department department);
	Collection<DepartmentTO> departmentToDepartmentTO(Collection<Department> department);

	
}
