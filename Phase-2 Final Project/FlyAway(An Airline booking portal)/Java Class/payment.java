package com;

public class payment {

	private String flight_name;
	private String flight_number;
	private String flight_price;
	private String booking_seats;
	private String username;
	private String bookingid;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getBooking_seats() {
		return booking_seats;
	}
	public void setBooking_seats(String booking_seats) {
		this.booking_seats = booking_seats;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public String getFlight_price() {
		return flight_price;
	}
	public void setFlight_price(String flight_price) {
		this.flight_price = flight_price;
	}
	
}
