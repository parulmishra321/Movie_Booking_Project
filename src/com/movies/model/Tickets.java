package com.movies.model;

import java.util.Date;

public class Tickets {

	private String Ticket_Id;
	private Date Ticket_Date;
	private String Movie_Name;
	private String Seat_No;
	private int price;
	
	public Tickets(String ticket_Id, Date ticket_Date, String movie_Name, String seat_No, int price) {

		Ticket_Id = ticket_Id;
		Ticket_Date = ticket_Date;
		Movie_Name = movie_Name;
		Seat_No = seat_No;
		this.price = price;
	}
	
	public String getTicket_Id() {
		return Ticket_Id;
	}
	public void setTicket_Id(String ticket_Id) {
		Ticket_Id = ticket_Id;
	}
	public Date getTicket_Date() {
		return Ticket_Date;
	}
	public void setTicket_Date(Date ticket_Date) {
		Ticket_Date = ticket_Date;
	}
	public String getMovie_Name() {
		return Movie_Name;
	}
	public void setMovie_Name(String movie_Name) {
		Movie_Name = movie_Name;
	}
	public String getSeat_No() {
		return Seat_No;
	}
	public void setSeat_No(String seat_No) {
		Seat_No = seat_No;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
