package com.lifemap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lifemap.entity.Branches;
import com.lifemap.entity.Tasks;
import com.lifemap.entity.Users;

public class CreateTasks {

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
								
			
					// get  the branch
					/*int branchId1 = 101;
					Branches tempBranch1 = session.get(Branches.class, branchId1);
					
					int urgLevel = 7;*/
				
					
					//Create a task
					/*Tasks tempTasks1 = new Tasks(tempBranch1, "Review and cleanup", urgLevel);
					Tasks tempTasks2 = new Tasks(tempBranch1, "Review pump", urgLevel);*/
					
				
					
					// save the tasks
					System.out.println("\nSaving branch ...");
					session.save(tempTasks1);
					session.save(tempTasks2);
					
					//System.out.println("Saved branch : " + tempBranch8);
					
					
					
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
