package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDoDao;
import com.example.demo.entityDo.User;
import com.example.demo.service.UserService;

import lombok.Getter;
import lombok.Setter;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDoDao userdao;

	@Override
	public User listAll(String username,String pwd) {
		// TODO Auto-generated method stub
		return userdao.listAll(username,pwd);
	}

	@Override
	public List<User> mapall(Integer id) {
		// TODO Auto-generated method stub
		return userdao.mapall(id);
	}
}
