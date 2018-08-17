package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.example.demo.entityDo.User;


@Mapper
public interface UserDoDao {
	
	@Select("select * from u_user where nickname=#{username} and pswd=#{pwd}")
	User listAll(@Param("username")String username,@Param("pwd")String pwd);

	
	@Select("select * from u_user where id=#{id}")
	@Results({		
		@Result(column="sub_id",property="subject",one=@One(select="com.example.demo.dao.SubjectDoDao.selectsubject"))
	})
	List<User> mapall(@Param("id")Integer id);
	
}
