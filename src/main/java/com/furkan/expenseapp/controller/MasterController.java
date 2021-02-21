package com.furkan.expenseapp.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.furkan.expenseapp.model.Expense;
import com.furkan.expenseapp.service.ExpenseService;

@Controller
public class MasterController {

	@Autowired
	ExpenseService expenseServices;
	
	@RequestMapping("/")
	public ModelAndView home() {
	
		ModelAndView mav = new ModelAndView("home");
		List<Expense> expenses = expenseServices.findAll();
		mav.addObject("expenses", expenses);
		System.out.println(expenses);
		return mav;
	}
	
	@RequestMapping("/expense")
	public ModelAndView addExpense() {
		ModelAndView mav = new ModelAndView("expense");
		mav.addObject("expense", new Expense());
		return mav;
	}
	
	
	  @RequestMapping(value = "/expense", method = RequestMethod.POST) 
	  public String saveExpense(@ModelAttribute("expense") Expense expense)
	  {
	  expenseServices.saveExpense(expense); 
	  return "redirect:/"; 
	  }
	 
	  @RequestMapping(value = "/expense/{id}")
	  public ModelAndView edit(@PathVariable("id") int id) {
		  ModelAndView mav = new ModelAndView("expense");
		  Expense expense = expenseServices.findById(id);
		  mav.addObject("expense",expense);
		  return mav;
	  }
	  
	  @RequestMapping(value = "/delete/{id}")
	  public String delete(@PathVariable("id") int id) {
		 
		 expenseServices.deleteById(id);
		  return "redirect:/";
	  }
	  
}
