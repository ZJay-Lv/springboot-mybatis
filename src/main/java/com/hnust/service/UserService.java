package com.hnust.service;

import java.util.List;

import com.hnust.pojo.User;

public interface UserService {

	User getUserById(Integer id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Integer id, User user);

	public int delete(Integer id);
}
