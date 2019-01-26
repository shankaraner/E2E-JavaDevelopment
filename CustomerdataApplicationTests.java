package com.shankar.customer.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shankar.customer.dal.entity.Customer;
import com.shankar.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {

	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setCustomer_name("Shankar2");
		customer.setEmail("shank@abc.com");
		customerRepository.save(customer);
	}
	
	@Test
	public void testFindCustomerbyId() {
		
		Customer customer = customerRepository.findById(1l).get();
		System.out.println(customer);
	}
	@Test
	public void testUpdateCustomer() {
		
		Customer customer = customerRepository.findById(1l).get();
		customer.setCustomer_name("Shankaraner");
		customerRepository.save(customer);
		
	}
	
	@Test
	public void testDeleteCustomer() {
		Customer cust = new Customer();
		cust.setCustomer_id(1l);				
		customerRepository.delete(cust);
		
	}

}

