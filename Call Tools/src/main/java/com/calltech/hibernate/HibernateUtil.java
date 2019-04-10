package com.calltech.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;

	static {
	    try {
	        sessionFactory = new Configuration().configure("hibernate.cfg.xml")
	        		.buildSessionFactory();

	    } catch (Exception ex) {
	        System.out.println(" Falha na criação inicial da  SessionFactory"
	                + ex);
	        throw new ExceptionInInitializerError(ex);
	    }
	}

	public static Session getSession() {
	    return sessionFactory.openSession();
	}
}
