package com.homework3.ylc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework3.ylc.dao.Dao;
import com.homework3.ylc.model.UserBehaviorDayUid;
import com.homework3.ylc.service.ServiceInterface;
@Service
public class ServiceImpl implements ServiceInterface{
    //spring bean 注入
	@Autowired
	private Dao dao;
	
	
	@Override
	public List<UserBehaviorDayUid> queryUserBehaviorDayUid(String start, String end)
	{
		List<UserBehaviorDayUid> service= dao.QueryUserBehaviorDateRange(start, end);
		return service;
	}

}
