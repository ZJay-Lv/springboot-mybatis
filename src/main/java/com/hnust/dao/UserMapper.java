package com.hnust.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hnust.pojo.User;

public interface UserMapper {

	@Select("SELECT * FROM tb_user WHERE id = #{id}")
	User getUserById(Integer id);

	@Select("SELECT * FROM tb_user")
	public List<User> getUserList();

	@Insert("insert into tb_user(id, name, age) values(#{id}, #{name}, #{age})")
	public int add(User user);

	@Update("UPDATE tb_user SET username = #{user.name} , age = #{user.age} WHERE id = #{id}")
	public int update(@Param("id") Integer id, @Param("user") User user);

	@Delete("DELETE from tb_user where id = #{id} ")
	public int delete(Integer id);
}