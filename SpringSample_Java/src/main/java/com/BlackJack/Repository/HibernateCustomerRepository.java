package com.BlackJack.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.BlackJack.Model.Customer;

@Repository("costumerRepository")
public class HibernateCustomerRepository implements ICustomerRepository {
	
	@Override
	public List<Customer> findAll(){ 
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstname("Rafat");
		customer.setLastname("Khandaker");
		
		customers.add(customer);
		
		return customers; 
	}
}
