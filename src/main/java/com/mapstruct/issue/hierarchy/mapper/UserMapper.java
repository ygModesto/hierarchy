package com.mapstruct.issue.hierarchy.mapper;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mapstruct.issue.hierarchy.model.User;
import com.mapstruct.issue.hierarchy.to.UserBaseTO;
import com.mapstruct.issue.hierarchy.to.UserTO;

@Mapper
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	UserBaseTO userToUserBaseTO(User user);
	Collection<UserTO> userToUserBaseTO(Collection<User> users);	
	UserTO userToUserTO(User user);
	Collection<UserTO> userToUserTO(Collection<User> users);
	
}
