package com.myproject.expensetracker.expense;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expense {
	
	private int id;
	private LocalDate date;
	private String descreption;
	private double amount;
	
	public Expense(int id, String descreption, double amount) {
		this.id = id;
		this.amount = amount;
		this.descreption = descreption;
		this.date = LocalDate.now();
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return id + " " + date + " " + descreption + " " + amount ;	
	}
	
	

}
