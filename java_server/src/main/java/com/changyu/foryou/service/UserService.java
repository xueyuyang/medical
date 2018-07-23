package com.changyu.foryou.service;

import com.changyu.foryou.model.Users;

public interface UserService {
	
	Users selectByUserId(String user_id);//根据用户手机号获取用户信息

	void addUsers(Users users);

	int updateUserInfo(Users users);
	
	Users checkLogin(String user_id);

}