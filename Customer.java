package com.shankar.customer.dal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long customer_id;
	  @Column(name="customer_name")
	  private String customer_name;
	  @Column(name="email")
	  private String email;
	  
	  
	public Long getCustomer_id() {
		return customer_id;
	}
	
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", email=" + email + "]";
	}
	  
	  
}
