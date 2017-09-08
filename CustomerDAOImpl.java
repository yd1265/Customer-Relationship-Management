package dao;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import entities.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Customer> getCustomers() {

		 // get the current session
		Session currentsession=sessionFactory.getCurrentSession();
		
		// create the query
		Query<Customer> thequery=currentsession.createQuery("from customer",Customer.class);
		
		//execute query and get result
		List<Customer> customers=thequery.getResultList();
		
		// retun result
		
		return customers;
	}

}
