package com.coverletter.main.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coverletter.main.mybatis.mapper.UserMapper;
import com.coverletter.main.mybatis.tables.UserDTO;

@Component
public class UserDao implements UserMapper {
	@Autowired
	private SqlSession sqlSession;
	
	public UserDTO selectAll() {
		return this.sqlSession.selectOne("findAll");
	}
}
