package com.prowings.cache;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Utility {

	static SessionFactory sessionfactory;
	public static SessionFactory getsessionfactory() {
		
		if(sessionfactory==null) {
		 sessionfactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 return sessionfactory;
		}
		else { 
				return sessionfactory;} 
	}
}
