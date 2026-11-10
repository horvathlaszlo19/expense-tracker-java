package com.myproject.expensetracker.expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
	
	private List<Expense> expenses;
	
	public ExpenseManager() {
		this.expenses = new ArrayList<>();
	}
	
	public List<Expense> getExpenses(){
		return this.expenses;
	}
	
	public void add(int id, String descreption, double amount) {
		this.expenses.add(new Expense(id, descreption, amount));
	}
	
	//delete
	
	//update
	
	//view all
	
	//sum
	
	//sum with specific month

}
