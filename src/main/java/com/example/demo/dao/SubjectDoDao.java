package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entityDo.Subject;


@Mapper
public interface SubjectDoDao {
	
	@Select("select * from subject where sub_id=#{id}" )
	Subject selectsubject(@Param("id")Integer id);
}
