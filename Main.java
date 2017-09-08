package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {

		SessionFactory sf=HibernateUtil.getSessionfactory();
		 Session session=sf.openSession();
		    session.beginTransaction();
		    
		   
		       session.getTransaction().commit();
		       session.close();
		System.out.println("Done with the queries");
		
	}

}
