package com.BlackJack.Repository;

import java.util.List;

import com.BlackJack.Model.Customer;

public interface ICustomerRepository {

	List<Customer> findAll();

}