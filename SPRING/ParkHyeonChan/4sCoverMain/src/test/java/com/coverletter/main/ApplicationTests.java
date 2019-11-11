package com.coverletter.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.coverletter.main.mybatis.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Autowired DataSource dataSource;
	@Autowired UserDao userDao;
	
	@Test
	public void dataSourceTest() {
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement("Select * From user");
			ResultSet rs = stmt.executeQuery();
			rs.next();
			
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			
			conn.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void mybatisTest() {
		System.out.println(userDao.selectAll());
	}
}
