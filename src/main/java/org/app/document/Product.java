package org.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id //Hexa Decimal Number---UUID
	private String id;
	private Integer prodId;
	private String prodCode;
	private double prodCost;
	
	public Product() {
		
	}

	public Product(Integer prodId, String prodCode, double prodCost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public double getProdCost() {
		return prodCost;
	}

	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	

}