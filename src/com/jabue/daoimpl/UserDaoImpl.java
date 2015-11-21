package com.jabue.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jabue.dao.UserDao;
import com.jabue.hibernate.bean.User;

/**
 * implementation of UserDao
 * 
 * @author Kris
 *
 */
public class UserDaoImpl implements UserDao {


	HibernateTemplate ht;
	private SessionFactory sessionFactory;

	/**
	 * setter functions used to insert sessionFactory for spring
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * init HibernateTemplate
	 */
	private void setHibernateTemplate(){
		if(ht==null){
			ht = new HibernateTemplate(sessionFactory);
		}
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		setHibernateTemplate();
		ht.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		setHibernateTemplate();
		ht.update(user);
	}

	@Override
	public User findUser(String username) {
		// TODO Auto-generated method stub
		setHibernateTemplate();
		return (User) ht.find("from User u where u.username=?", username);
	}

}
