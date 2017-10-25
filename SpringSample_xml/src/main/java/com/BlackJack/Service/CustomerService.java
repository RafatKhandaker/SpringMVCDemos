package com.BlackJack.Service;

import java.util.List;

import com.BlackJack.Model.Customer;
import com.BlackJack.Repository.ICustomerRepository;

public class CustomerService implements ICustomerService {
	
	private ICustomerRepository customerRepository;

	@Override
	public List<Customer> findAll(){ 
		return customerRepository.findAll(); 
	}
	
	public void setCustomerRepository(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public void setFoo(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	} 	
	
	
	public CustomerService() {}
	
	public CustomerService(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
