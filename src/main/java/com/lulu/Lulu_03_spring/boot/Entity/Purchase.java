package com.lulu.Lulu_03_spring.boot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="purchase")
@Entity
public class Purchase {
	  @Id
	int id;
	String productname;
	float cost ;
	String dateOfPurchase;
	String deliveryDate;
	String feedback ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", productname=" + productname + ", cost=" + cost + ", dateOfPurchase="
				+ dateOfPurchase + ", deliveryDate=" + deliveryDate + ", feedback=" + feedback + "]";
	}
	public Purchase(int id, String productname, float cost, String dateOfPurchase, String deliveryDate,
			String feedback) {
		super();
		this.id = id;
		this.productname = productname;
		this.cost = cost;
		this.dateOfPurchase = dateOfPurchase;
		this.deliveryDate = deliveryDate;
		this.feedback = feedback;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
