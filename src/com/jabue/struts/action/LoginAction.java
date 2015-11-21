package com.jabue.struts.action;

import com.jabue.struts.intface.Action;
import com.jabue.daoimpl.UserDaoImpl;
import com.jabue.hibernate.bean.User;

public class LoginAction implements Action {

	// the user data here is inserted by struts
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	// the class is inserted by spring
	private UserDaoImpl userDaoImpl;
	
	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(user.getUsername().equalsIgnoreCase("jabue")&& user.getPassword().equalsIgnoreCase("jabue")){
			// System.out.println(userDaoImpl.findUser("lucia"));
			
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
