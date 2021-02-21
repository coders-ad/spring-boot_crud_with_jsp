package com.furkan.expenseapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furkan.expenseapp.model.Expense;
import com.furkan.expenseapp.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		
		return expenseRepository.findAll();
	}

	@Override
	public void saveExpense(Expense expense) {
		expense.setCreatedAt(System.currentTimeMillis());
		expenseRepository.save(expense);
	}

	@Override
	public Expense findById(int id) {
			if(expenseRepository.findById(id).isPresent()) {
				return expenseRepository.findById(id).get();
			}
		return null;
	}

	@Override
	public void deleteById(int id) {
			expenseRepository.deleteById(id);	
	}

}
