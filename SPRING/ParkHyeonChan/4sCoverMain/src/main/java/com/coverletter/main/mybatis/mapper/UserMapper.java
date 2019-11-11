package com.coverletter.main.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.coverletter.main.mybatis.tables.UserDTO;

@Mapper
public interface UserMapper {
	UserDTO selectAll();
}
