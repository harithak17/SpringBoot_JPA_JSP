package org.springboot.jpa.jsp.controller;

import java.util.List;

import org.springboot.jpa.jsp.model.Customer;
import org.springboot.jpa.jsp.model.Product;
import org.springboot.jpa.jsp.services.CustomerService;
import org.springboot.jpa.jsp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

	@Autowired
	ProductService prodService;

	@Autowired
	CustomerService custService;
	
	@GetMapping("/")
	public String loadPage()
	{
		return "index";
	}
	
	@GetMapping("/cust")
	// http://localhost:8088/cust
	public String addCustomer() {
		return "AddCust";
	}

	@GetMapping("/addPro")
	// http://localhost:8088/addPro
	public String addProduct(Model model) {
		model.addAttribute("product", new Product());
		return "AddProd";
	}
	
//	@PostMapping("/addProduct")
//	public String placeOrder(@Validated @ModelAttribute("product") Product P, BindingResult bindingResult,Model model) {
//		System.out.println(P);
//		if (bindingResult.hasErrors()) {			
//			  model.addAttribute("prodName", P.getProdName());
//		      model.addAttribute("prodPrice", P.getProdPrice());
//		      model.addAttribute("prodQty", P.getProdQty());
//			return "AddProd";			
//		}
//		prodService.saveProduct(P);
//		return "redirect:/viewProduct";
////		System.out.println("Name:"+P.getProdName());
////		System.out.println("Price:"+P.getProdPrice());
////		System.out.println("Qty:"+P.getProdQty());
////		return "redirect:/saveProducts";
//	}

	@RequestMapping(value="/saveProducts",method=RequestMethod.POST)
	public String placeOrder(@ModelAttribute("product") Product P) {
		System.out.println("Name:"+P.getProdName());
		System.out.println("Price:"+P.getProdPrice());
		System.out.println("Qty:"+P.getProdQty());
		prodService.saveProduct(P);
		return "redirect:/viewProduct";
	}
	
	@PostMapping("/addCust")
	public String addCustomer(@ModelAttribute Customer cust) {
		custService.saveCust(cust);
		return "redirect:/viewCust";
	}

	@GetMapping("/viewCust")
	public String viewCustomers(Model m) {
		List<Customer> custList = custService.viewCust();
		m.addAttribute("cust", custList);
		return "ViewCust";
	}

	@GetMapping("/viewProduct")
	public String viewProducts(Model m) {
		List<Product> prodList = prodService.viewProduct();
		m.addAttribute("prod", prodList);
		return "ViewProd";
	}

	@GetMapping("/viewCustById/{id}")
	public String viewCustomerById(@PathVariable int id, Model m) {
		Customer custm = custService.viewCustById(id);
		m.addAttribute("custm", custm);
		return "EditCust";
	}
	
	@PostMapping("/editcust")
	public String EditCustomer(@ModelAttribute("cust") Customer c)
	{
		System.out.print("Customer Id"+c.getCustId());
		custService.editCustomerById(c);
		return "redirect:/viewCust";
	}
	
	@GetMapping("/delCustById/{id}")
	public String delCustById(@PathVariable int id) {
		custService.deleteCust(id);
		return "redirect:/viewCust";
	}

	@GetMapping("/viewProdById/{id}")
	public String viewProductById(@PathVariable int id, Model m) {
		Product prod = prodService.viewProdById(id);
		m.addAttribute("prod", prod);
		return "EditProd";
	}

	@GetMapping("/delProdById/{id}")
	public String delProdById(@PathVariable int id) {
		prodService.deleteProduct(id);
		return "redirect:/viewProduct";
	}
	
	@GetMapping("/viewCustByEmail/{email}")
	public String viewCustByEmail(@PathVariable String email,Model m)
	{
//		Customer custm=custService.viewCustByEmail(email);
		Customer custm=custService.viewCustByEmail("sree@gmail.com");
		m.addAttribute("custm", custm);
		return "EditCust";
	}
	
	@PostMapping("/editProd")
	public String EditProduct(@ModelAttribute("prod") Product p)
	{
		System.out.print("Product Id"+p.getProdId());
		prodService.viewProdById(p.getProdId());
//		custService.editCustomerById(c);
		return "redirect:/viewCust";
	}
}
