package com.lulu.Lulu_03_spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lulu.Lulu_03_spring.boot.Entity.Purchase;
import com.lulu.Lulu_03_spring.boot.Repository.PurchaseRepository;


@RestController
public class MyController {
	@Autowired

	PurchaseRepository purchaseRepository;
	


	@GetMapping("/getPurchase")

	public List<Purchase> getJPQL() {

 

		return purchaseRepository.findAll(); // select * from <TableName>;

 

	}


	@PostMapping("/addPurchase")

	public Purchase createuser(@RequestBody Purchase prod) {

		return purchaseRepository.save(prod);

	}
////Delete Operations  @PathVariable..

	
			///Delete Operations  @PathVariable..

			@DeleteMapping("/deletePurchase/{id}")
			public void deletProduct(@PathVariable("id") Integer id  ) {

		 

				purchaseRepository.deleteById(id); // select * from <TableName>;

		 
			}
			
}
