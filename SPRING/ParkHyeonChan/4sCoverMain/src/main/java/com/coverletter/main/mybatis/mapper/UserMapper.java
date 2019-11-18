package com.coverletter.main.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.coverletter.main.mybatis.tables.UserDTO;

@Mapper
@Component
public interface UserMapper {
	UserDTO findAll();
	UserDTO findByEmail(String uemail);
	int insertUser(UserDTO userDTO);
}
