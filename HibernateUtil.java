package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}catch (Exception e) {
			
			System.err.println(" Initial Failed  "+e.getMessage());
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	
}
