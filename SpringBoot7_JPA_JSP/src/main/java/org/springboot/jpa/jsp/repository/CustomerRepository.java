package org.springboot.jpa.jsp.repository;

import org.springboot.jpa.jsp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query(value="select * from customer where cust_email=?1",nativeQuery =true)
	public Customer findCustByEmail(String email);
}
