/**
 * 
 */
package com.spartans.Starbucks.dao;

/**
 * @author musahay
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_INFORMATION")
public class CardDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int id;
	
	@Column(name = "CUST_ID")
	int cust_id;
	
	@Column(name = "CARD_ID")
	int card_id;

	@Column(name = "CARD_CODE")
	int card_code;
	
	@Column(name = "BALANCE")
	double balance;

	public CardDetails(int id, int cust_id, int card_id, int card_code, double balance) {
		super();
		
		this.id = id;
		this.cust_id = cust_id;		
		this.card_id = card_id;
		this.card_code = card_code;
		this.balance = balance;
	}
	
	public CardDetails() {
		super();
	}

	public int get_id() {
		return id;
	}

	public void set_id(int id) {
		this.id = id;
	}
	
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}
	
	public int getCard_code() {
		return card_code;
	}

	public void setCard_code(int card_code) {
		this.card_code = card_code;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}