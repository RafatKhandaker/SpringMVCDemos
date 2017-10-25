package com.BlackJack.Service;

import java.util.List;

import com.BlackJack.Model.Customer;
import com.BlackJack.Repository.HibernateCustomerRepository;
import com.BlackJack.Repository.ICustomerRepository;

public class CustomerService implements ICustomerService {
	
	private ICustomerRepository customerRepository = new HibernateCustomerRepository();
	
	/* (non-Javadoc)
	 * @see com.BlackJack.Service.ICustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){ 
		return customerRepository.findAll(); 
	}
}
