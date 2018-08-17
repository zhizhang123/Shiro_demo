package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entityDo.User;


public interface UserService {
	User listAll(String username,String pwd);
	List<User> mapall(Integer id);
}
