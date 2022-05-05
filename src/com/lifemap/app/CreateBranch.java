package com.lifemap.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lifemap.entity.Branches;
import com.lifemap.entity.Tasks;
import com.lifemap.entity.Users;

public class CreateBranch {

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
								
			
					// get  the user
					int userId1 = 100;
					Users tempUser = session.get(Users.class, userId1);
					
					int userId2 = 101;
					Users tempUser2 = session.get(Users.class, userId2);
					
					//Create a branch
					
					//John's branches
					//Branches tempBranch1 = new Branches(0, "John's car problem", tempUser);
					/*Branches tempBranch2 = new Branches(100, "Tidy car's trunk", tempUser);
					Branches tempBranch3 = new Branches(100, "Cleanup interior", tempUser);
					
					Branches tempBranch4 = new Branches(0, "Finance", tempUser);*/
					/*Branches tempBranch5 = new Branches(103, "Bank","Go to bank", tempUser);
					Branches tempBranch6 = new Branches(103, "Store","Shopping in store", tempUser);*/
					
					// Jane's branches
					/*Branches tempBranch7 = new Branches(0, "Health","Review health lifestyle", tempUser2);
					Branches tempBranch8 = new Branches(108, "Yoga","Get yoga classes", tempUser2);*/
								
				
					
					// save the branches
					System.out.println("\nSaving branch ...");
					/*session.save(tempBranch2);
					session.save(tempBranch3);
					session.save(tempBranch4);
					session.save(tempBranch5);
					session.save(tempBranch6);
					session.save(tempBranch7);
					session.save(tempBranch8);*/
					
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
