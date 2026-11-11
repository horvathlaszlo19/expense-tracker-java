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
	
	public void delete(int id) {
		this.expenses.remove(getIndex(id));
	}
	
	
	public void update(int id, String descreption, double amount) {
		Expense exp = expenses.get(getIndex(id));
		exp.setDescreption(descreption);
		exp.setAmount(amount);
		
	}
	
	//view all
	
	//sum
	
	//sum with specific month
	
	private int getIndex(int id) {
		int result = 0;
		try {
			for(int i=0; i < expenses.size(); i++) {
				if(expenses.get(i).getId() == id) {
					result = i;
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


}
