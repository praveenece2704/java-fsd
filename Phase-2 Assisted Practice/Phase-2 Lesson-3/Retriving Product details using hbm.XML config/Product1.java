package com;


public class Product1 {
	
	private int productid;

	private String productname;

	private int productprice;
	
	private int supplierid;
	
	private int categoryid;
	
	private int availablecount;
	
	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product1(int productid, String productname, int productprice, int supplierid, int categoryid,
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
