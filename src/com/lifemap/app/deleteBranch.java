package com.lifemap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lifemap.entity.Branches;
import com.lifemap.entity.Tasks;
import com.lifemap.entity.Users;
public class deleteBranch {

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
				
			// get the branch from database
			int branchId = 107;
			Branches tempBranch = session.get(Branches.class, branchId);
		
			// delete branch
			System.out.println("\nDeleting student: " + tempBranch);
			session.delete(tempBranch);
			
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
