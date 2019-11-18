package com.coverletter.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coverletter.main.errors.Exception.DuplicateIdException;
import com.coverletter.main.mybatis.mapper.UserMapper;
import com.coverletter.main.mybatis.tables.UserDTO;
import com.coverletter.main.requestparam.RegisterParam;

@Service
public class UserService {
	@Autowired UserMapper usermapper;

	public void registerUser(RegisterParam param) throws DuplicateIdException {
		//Id가 있는지 검사
		UserDTO userDTO = usermapper.findByEmail(param.getUserEmail());
		if(userDTO != null) throw new DuplicateIdException();
		//없을 시 전달된 Parameter로 전달된 정보 DB에 입력
		else {
			
		}
	}
}
