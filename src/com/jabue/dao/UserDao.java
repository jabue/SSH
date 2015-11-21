package com.jabue.dao;

import com.jabue.hibernate.bean.User;

/**
 * 
 * all the user data functions
 * 
 * @author Kris
 *
 */
public interface UserDao {
	/**
	 * save user
	 * 
	 * @param user
	 */
	public void saveUser(User user);

	/**
	 * update user
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * find user by username
	 * 
	 * @param name
	 * @return
	 */
	public User findUser(String username);
}
