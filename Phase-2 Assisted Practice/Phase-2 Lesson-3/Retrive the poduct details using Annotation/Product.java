package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productentry")
public class Product {
	@Id
	@Column(name="productid")
	private int productid;
	@Column(name="productname")
	private String productname;
	@Column(name="productprice")
	private int productprice;
	@Column(name="supplierid")
	private int supplierid;
	@Column(name="categoryid")
	private int categoryid;
	@Column(name="availablecount")
	private int availablecount;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productname, int productprice, int supplierid, int categoryid,
			int availablecount) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.supplierid = supplierid;
		this.categoryid = categoryid;
		this.availablecount = availablecount;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getAvailablecount() {
		return availablecount;
	}
	public void setAvailablecount(int availablecount) {
		this.availablecount = availablecount;
	}
	

}
