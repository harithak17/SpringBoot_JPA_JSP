package org.springboot.jpa.jsp.services;

import java.util.List;

import org.springboot.jpa.jsp.model.Customer;
import org.springboot.jpa.jsp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository custRepo;

	public Customer saveCust(Customer cust) {
		return custRepo.save(cust);
	}

	public void deleteCust(int id) {
		custRepo.deleteById(id);
	}

	public List<Customer> viewCust() {
		return custRepo.findAll();
	}

	public Customer viewCustById(int id) {
		return custRepo.findById(id).get();
	}
	
	public void editCustomerById(Customer c)
	{
		boolean isTrue= custRepo.findById(c.getCustId()).isPresent();
		if(isTrue)
		{
//			Customer c=new Customer();
//			c.setCustId(cust.getCustId());
//			c.setCustName(cust.getCustName());
//			c.setCustGender(cust.getCustGender());
//			c.setCustEmail(cust.getCustEmail());
			custRepo.save(c);
		}
	}
	
	public Customer viewCustByEmail(String email)
	{
		return custRepo.findCustByEmail(email);
	}
}
