package com.homework3.ylc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.homework3.ylc.model.UserBehaviorDayUid;

@Mapper
//访问数据库层
public interface Dao {
    // 动态注入
    @SelectProvider(type = UserBehaviorDateRange.class, method = "QueryUserBehaviorDateRange")  
    List<UserBehaviorDayUid> QueryUserBehaviorDateRange(String start, String end);
    
    class UserBehaviorDateRange{
    	public String QueryUserBehaviorDateRange(String start, String end)
    	{
    		String sql = "";
    		if(start != null)
    		{
    			if(end != null)
    			{
    				sql = String.format("select userinfo.Level,userinfo.Degree,userbehaviorday_uid.* from userbehaviorday_uid  LEFT JOIN userinfo on userbehaviorday_uid.uid = userinfo.Uid where day_time >= '%s' and day_time < '%s'", start, end);
    			}
    			else
    			{
    				sql = String.format("select userinfo.Level,userinfo.Degree,userbehaviorday_uid.* from userbehaviorday_uid  LEFT JOIN userinfo on userbehaviorday_uid.uid = userinfo.Uid where day_time >= '%s'", start);
    			}
    		}
    		else
    		{
    			if(end != null)
    			{
    				sql = String.format("select userinfo.Level,userinfo.Degree,userbehaviorday_uid.* from userbehaviorday_uid  LEFT JOIN userinfo on userbehaviorday_uid.uid = userinfo.Uid where day_time < '%s'", end);
    			}
    			else
    			{
    				sql = "select userinfo.Level,userinfo.Degree,userbehaviorday_uid.* from userbehaviorday_uid  LEFT JOIN userinfo on userbehaviorday_uid.uid = userinfo.Uid ";
    			}
    		}
//    		System.out.println(sql);
    		
    		return sql;
    	}
    }
}
