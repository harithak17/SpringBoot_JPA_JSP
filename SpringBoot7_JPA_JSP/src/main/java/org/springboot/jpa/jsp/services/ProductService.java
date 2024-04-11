package org.springboot.jpa.jsp.services;

import java.util.List;

import org.springboot.jpa.jsp.model.Product;
import org.springboot.jpa.jsp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Service
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductService {

	@Autowired
	ProductRepository prodRepo;

	public Product saveProduct(Product prod) {
		return prodRepo.save(prod);
	}

	public void deleteProduct(int id) {
		prodRepo.deleteById(id);
	}

	public List<Product> viewProduct() {
		return prodRepo.findAll();
	}

	public Product viewProdById(int id) {
		return prodRepo.findById(id).get();
	}
}
