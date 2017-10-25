package com.BlackJack.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.BlackJack.Model.Customer;
import com.BlackJack.Repository.ICustomerRepository;

@Service("customerService2")
public class CustomerService2 implements ICustomerService {
	
	private String dbUsername;
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public CustomerService2() {
		// TODO Auto-generated constructor stub
	}

	@Autowired 	    //Constructor injection, AutoWire with annotations
	public CustomerService2(ICustomerRepository customerRepository) {
		System.out.print("Constructor Injection with Annotations ");
		this.customerRepository = customerRepository;
	} 

	@Autowired
	private ICustomerRepository customerRepository;

	@Autowired      // add setter-injection with annotations
	public void setCustomerRepository(ICustomerRepository customerRepository) {
		System.out.print("Setter Injection with Annotations ");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){ 
		System.out.println(dbUsername);
		return customerRepository.findAll(); 
	}
	
}
