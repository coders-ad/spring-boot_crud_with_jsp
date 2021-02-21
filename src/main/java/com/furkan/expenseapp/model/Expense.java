package com.furkan.expenseapp.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_expense")
@Getter
@Setter
@ToString
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "description")
	private String expensename;
	
	private BigDecimal amount;
	
	private String note;
	@Column(name = "created_at")
	private long createdAt;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getExpensename() {
		return expensename;
	}



	public void setExpensename(String expensename) {
		this.expensename = expensename;
	}



	public BigDecimal getAmount() {
		return amount;
	}



	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	public long getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(long l) {
		this.createdAt = l;
	}



	@Override
	public String toString() {
		return "Expense [id=" + id + ", expensename=" + expensename + ", amount=" + amount + ", note=" + note
				+ ", createdAt=" + createdAt + "]";
	}
	
}
