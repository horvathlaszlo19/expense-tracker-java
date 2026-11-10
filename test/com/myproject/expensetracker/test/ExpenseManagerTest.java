package com.myproject.expensetracker.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.myproject.expensetracker.expense.ExpenseManager;

class ExpenseManagerTest {

	@Test
	public void initManagerWithEmptyList() {
		ExpenseManager em = new ExpenseManager();
		assertEquals(0, em.getExpenses().size());
	}
	
	@Test
	public void addOneExpense() {
		ExpenseManager em = new ExpenseManager();
		em.add(1,"aaa",20);
		assertEquals(1, em.getExpenses().size());
	}

}
