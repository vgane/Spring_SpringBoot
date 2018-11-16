package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args) {
		//1-create session factory
		
		SessionFactory factory =new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session
		Session session= factory.getCurrentSession();
		
		try {
			System.out.println("Creating student");
			Student tempStudent=new Student("Paul","Wall","paul@gmail.com");
			session.beginTransaction();
			System.out.println("Saving student");
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("Done!");
		}finally {
			factory.close();
		}

	}

}
