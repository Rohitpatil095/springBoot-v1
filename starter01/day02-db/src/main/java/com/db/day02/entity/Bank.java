package com.db.day02.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String Bname;
	public int totalAmount;
	public boolean isInLoss;
	
	
	public Bank() {
		super();
	}

	public Bank(String bname, int totalAmount, boolean isInLoss) {
		super();
		this.Bname = bname;
		this.totalAmount = totalAmount;
		this.isInLoss = isInLoss;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		this.Bname = bname;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean getisInLoss() {
		return isInLoss;
	}

	public void setInLoss(boolean isInLoss) {
		this.isInLoss = isInLoss;
	}
}
