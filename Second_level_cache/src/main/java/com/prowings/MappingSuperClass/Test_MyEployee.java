package com.prowings.MappingSuperClass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.prowings.cache.Hibernate_Utility;

public class Test_MyEployee {

	public static void main(String[] args) {
		
		Session  session = Hibernate_Utility.getsessionfactory().openSession();
		
		MyEmployee emp1 = new MyEmployee("AAA", 5000.0,  5, 56);
		Student st1 =new Student("Maths",14);
		
		
		Transaction tx = session.beginTransaction();
		session.save(emp1);
		session.save(st1);
		tx.commit();
		session.close();
		
		
		
		
		
		

	}

}
