package com;

public class product {
	
	public int productid;
	public String productname;
	public String productreview;
	@Override
	public String toString() {
		return "product [productid=" + productid + ", productname=" + productname + ", productreview=" + productreview
				+ ", productrating=" + productrating + ", supplierid=" + supplierid + ", customerid=" + customerid
				+ ", productprice=" + productprice + "]";
	}
	public product(int productid, String productname, String productreview, int productrating, int supplierid,
			int customerid, int productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productreview = productreview;
		this.productrating = productrating;
		this.supplierid = supplierid;
		this.customerid = customerid;
		this.productprice = productprice;
	}
	public int productrating;
	public int supplierid;
	public int customerid;
	public int productprice;
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
	public String getProductreview() {
		return productreview;
	}
	public void setProductreview(String productreview) {
		this.productreview = productreview;
	}
	public int getProductrating() {
		return productrating;
	}
	public void setProductrating(int productrating) {
		this.productrating = productrating;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

}
