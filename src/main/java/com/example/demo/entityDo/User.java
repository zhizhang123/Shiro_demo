package com.example.demo.entityDo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nickname;
	private String email;
	private String pswd;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date lastLoginTime;
	private String status;	
	
	private Subject subject;
	
	
}
