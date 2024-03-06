package com.prowings.cache;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDao {

	public static void main(String[] args) {

		Session session = Hibernate_Utility.getsessionfactory().openSession();

		Employee emp1 = new Employee();
		emp1.setName("AAA");
		emp1.setAddress("Pune");
		emp1.setSalary(25000.0);

		Transaction tx = session.beginTransaction();
		// session.save(emp1);

		tx.commit();

		Employee session1 = session.get(Employee.class, 1);
		System.out.println(session1);
		

		Session session2 = Hibernate_Utility.getsessionfactory().openSession();
		
         Employee emp =	session2.get(Employee.class, 1);
         System.out.println(emp);
         
         Transaction tx2 = session2.beginTransaction();
         tx2.commit();

		session.close();
		session2.close();
	}

}
