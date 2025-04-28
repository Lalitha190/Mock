package com.example;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.prodrepo.ProductRepository;
import com.example.product.Product;

@Component
public class BaseOperation implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product("Laptop", "Black", 60000.00));
		repo.save(new Product("Mobile", "Blue", 20000.00));
		repo.save(new Product("Table", "Brown", 600.00));
		repo.save(new Product("Book", "Orange", 300.00));
		repo.save(new Product("Tv", "Black", 65000.00));
		repo.save(new Product("Bottle", "Pink", 300.00));
		
		/*
		 * Optional<Product> pro=repo.findById(2); if(pro.isPresent()) {
		 * System.out.println(pro.get()); } else { System.out.println("No Data Found");
		 * } repo.findAll().forEach(System.out::println);
		 * 
		 * repo.deleteById(3); repo.deleteAll(); repo.deleteAllInBatch();
		 */

	}

}
