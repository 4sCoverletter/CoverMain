package com.coverletter.main.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.coverletter.main.mybatis.tables.TeamMemberDTO;

@Mapper
@Component
public interface TeammemberMapper {
	public List<TeamMemberDTO> findAll(); 
}
