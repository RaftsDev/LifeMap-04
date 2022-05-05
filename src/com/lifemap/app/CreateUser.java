package com.lifemap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lifemap.entity.Branches;
import com.lifemap.entity.Tasks;
import com.lifemap.entity.Users;

public class CreateUser {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.addAnnotatedClass(Branches.class)
								.addAnnotatedClass(Tasks.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// create the users
			/*Users tempUser1 = new Users("John", "John");
			Users tempUser2 = new Users("Jane", "Jane");*/
						
		
			
			// save the users
			System.out.println("\nSaving students ...");
			/*session.save(tempUser1);
			session.save(tempUser2);
			System.out.println("Saved students 1: " + tempUser1);
			System.out.println("Saved students 2: " + tempUser2);*/
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}

	}

}
