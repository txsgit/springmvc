package com.kxt.service;

import java.util.List;
import java.util.Map;

import com.kxt.domain.User;

public interface UserService {
	
	
	public User getUSer(User user);
	
	public boolean addUSer(User user);
	
	public List<User> selectUser(Map<String,Object> map);
	
	public boolean deleteUser(Map<String,Object> map);
	
	public boolean updateUser(User user);

}
