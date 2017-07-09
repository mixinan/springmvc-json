package cn.tedu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.entity.User;

@Controller
public class JsonController {
	@RequestMapping("/json1.do")
	@ResponseBody   //µ÷ÓÃjackson
	public User loadUser(){
		User user = new User(1, "Jack", "20");
		return user;
	}
	
	@RequestMapping("/json2.do")
	@ResponseBody
	public List<User> loadUsers(){
		List<User> data = new ArrayList<User>();
		User u1 = new User(1, "cang", "22");
		User u2 = new User(2, "gou", "23");
		
		data.add(u1);
		data.add(u2);
		return data;
	}
	
	@RequestMapping("/json3.do")
	@ResponseBody
	public Map<String, Object> loadData(){
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("id", 1);
		data.put("name", "¹·µ°¶ù");
		return data;
	}
}
