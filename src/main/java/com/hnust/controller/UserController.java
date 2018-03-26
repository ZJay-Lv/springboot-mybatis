package com.hnust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hnust.pojo.User;
import com.hnust.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/search/{id}", method = RequestMethod.GET)
	public User getUserById (@PathVariable(value = "id") Integer id){
		User user = null;
		try {
			user = userService.getUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	/**
	 * 查询用户列表
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<User> getUserList (){
		return null;
	}

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public int add (@RequestBody User user){
		return userService.add(user);
	}

	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public int delete (@PathVariable(value = "id") Integer id){
		return userService.delete(id);
	}

	/**
	 * 根据id修改用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public int update (@PathVariable("id") Integer id, @RequestBody User user){
		return userService.update(id, user);
	}

}