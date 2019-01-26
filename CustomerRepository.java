package com.shankar.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.shankar.customer.dal.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
