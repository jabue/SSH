package com.jabue.struts.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.jabue.struts.intface.Action;
import com.jabue.daoimpl.UserDaoImpl;
import com.jabue.hibernate.bean.User;

public class LoginAction implements Action, ServletResponseAware {

	private HttpServletResponse response;
	// the user data here is inserted by struts
	private String device;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	// the class is inserted by spring
	private UserDaoImpl userDaoImpl;

	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (user.getUsername().equalsIgnoreCase("jabue")
				&& user.getPassword().equalsIgnoreCase("jabue")) {
			// this device value means return data to browser
			if (device == null || device.equalsIgnoreCase("2")) {
				return SUCCESS;
			} else {
				// return data to phone
				response.setCharacterEncoding("utf-8");
				PrintWriter pw = null;
				try {
					pw = response.getWriter();
					pw.write("here is jason data");
				} catch (IOException e) {
					System.out.println("some thing is wrong with the io");
				}
				// response.setCharacterEncoding("utf-8");

				pw.flush();
				pw.close();
				return null;
			}
		} else {
			return ERROR;
		}
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response = arg0;
	}
}
