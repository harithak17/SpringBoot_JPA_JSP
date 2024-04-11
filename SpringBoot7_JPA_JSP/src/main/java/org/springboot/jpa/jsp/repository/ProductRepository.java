package org.springboot.jpa.jsp.repository;

import org.springboot.jpa.jsp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
