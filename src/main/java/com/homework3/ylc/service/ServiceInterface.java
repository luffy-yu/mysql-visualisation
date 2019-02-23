package com.homework3.ylc.service;

import java.util.List;
import com.homework3.ylc.model.UserBehaviorDayUid;

public interface ServiceInterface {
	List<UserBehaviorDayUid> queryUserBehaviorDayUid(String start, String end);
}
