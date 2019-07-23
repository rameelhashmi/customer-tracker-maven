package com.rameelhashmi.spring.dao;

import java.util.List;

import com.rameelhashmi.spring.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
