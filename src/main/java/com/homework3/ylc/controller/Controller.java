package com.homework3.ylc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework3.ylc.model.UserBehaviorDayUid;
import com.homework3.ylc.service.ServiceInterface;
//定义类方法路由
@RequestMapping(value = "/")
@RestController
public class Controller {
     @Autowired
     private ServiceInterface service;
	
	@RequestMapping("/queryUserBehaviorDayUid")
	public List<UserBehaviorDayUid> queryUserBehaviorDayUid(String start, String end)
	{
//		System.out.println(start + "-" + end);
		List<UserBehaviorDayUid> list = service.queryUserBehaviorDayUid(start, end);
		return list;
	}
}
