package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entityDo.User;
import com.example.demo.enumall.ChartType;
import com.example.demo.enumall.HigchartsData;
import com.example.demo.enumall.ResponseMapAjax;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/sh.init")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/login")
	public String index() {
		return "/login";
	}
	
	@RequestMapping("/map")
	@ResponseBody 
	@CrossOrigin(origins = "*", maxAge = 3600)
	public Map<String,Object> showmap(){
		String name="销量";
		String array[]= {"1","2","3","4"};
		Map<String,Object> map=new HashMap();
		map.put("type", "category");
		map.put("title", name);
		map.put("Xarray", array);
		map.put("Yarray", array);
		map.put("smooth", true);
		return map;
	}
	
	@RequestMapping("/userlist")
	public String userlist(Model model) {		
		model.addAttribute("userlist",userservice.mapall(1));		
		return "/main";
	}
	
	@PostMapping("/submit")
	@ResponseBody
	public Integer submit(Model model,User user,HttpServletRequest request) {
		Map<String,Object> map=new HashMap<>();
		HttpSession session=request .getSession(); 
		Integer msg;
		try {
			User u1=userservice.listAll(user.getNickname(),user.getPswd());	
			session.setAttribute("admin", u1.getNickname());
			if(u1.getId()!=null) {
				return msg=1;
			}else{
				return msg=2;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return msg=2;
		}
	
		
	}
	
	
	@RequestMapping("/ajax")
	@ResponseBody
	@CrossOrigin(origins = "*", maxAge = 3600)
	public ResponseMapAjax showtime() {	
		String[] xAxis= {"菠萝","荔枝" ,"西瓜","哈密瓜","火龙果"};
		Integer[] yAxis= {1,2,3,4,5};
		Integer[] data= {2,1,2,1,2};
		Integer[] data1= {1,2,1,2,1};
		List<HigchartsData> lsit=new ArrayList<HigchartsData>();
		HigchartsData h=new HigchartsData(1,"小红",data);
		HigchartsData h1=new HigchartsData(2,"小黑",data1);
		lsit.add(h);
		lsit.add(h1);
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("series", lsit);
		ResponseMapAjax r=new ResponseMapAjax("我的第一个图表",xAxis,yAxis,map);
		return r;
	}
	
	
	

}
