package com.lifemap.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lifemap.entity.Branches;
import com.lifemap.entity.Tasks;
import com.lifemap.entity.Users;

public class UpdateTask {

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
				
			// get the student from database
			int taskId = 1002;
			Tasks tempTask = session.get(Tasks.class, taskId);
			
			
			System.out.println("\nLoaded task before change: " + tempTask);
			tempTask.setShortDesc("Review and cleanup.");
			System.out.println("Tasks: " + tempTask);		
						
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

