package com.lulu.Lulu_03_spring.boot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lulu.Lulu_03_spring.boot.Entity.Purchase;



public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
		@Query("SELECT s FROM purchase s ")
		List<Purchase> findAllMyQuery1();
		
		
//		@Query("SELECT * FROM SportProduct s ",nativeQuery = true)  ///Native Query 
		@Query(value ="SELECT * FROM purchase ",nativeQuery = true)  ///Native Query

		List<Purchase> findAllNativeQuey();

}
