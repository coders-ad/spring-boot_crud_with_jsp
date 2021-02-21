package com.furkan.expenseapp.service;

import java.util.List;

import com.furkan.expenseapp.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
    void saveExpense(Expense ex);
    Expense findById(int id);
    void deleteById(int id);
}
