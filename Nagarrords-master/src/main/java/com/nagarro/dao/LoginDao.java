package com.nagarro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.nagarro.entity.Users;
/**
 * 
 * @author kanikamahajan01
 *
 */
public class LoginDao {
	public boolean checkLogin(String uname, String pass) {
		SessionFactory factory = new Configuration().configure("hibernate2.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Query query;
		query = session.createQuery("from Users where uname=:uname AND  pass=:pass");

		query.setParameter("uname", uname);
		query.setParameter("pass", pass);
		
		
		Users user=(Users) query.uniqueResult();
		
		if(user!=null) {
			return true;
		}

		return false;
	}
}
