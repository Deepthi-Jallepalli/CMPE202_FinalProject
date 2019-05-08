/**
 * 
 */
package com.spartans.Starbucks.controller;

/**
 * @author musahay
 *
 */

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spartans.Starbucks.dao.CardDetails;
import com.spartans.Starbucks.service.CardDetailsRowMapper;
import com.spartans.Starbucks.service.ManageCardService;


@RestController
public class TransactionController {
	
	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	ManageCardService manageCardService;
	
	@GetMapping("/makepayment")
	public String makepayment() {
	
		System.out.println("In makepayment Controller");
		return "makepayment";
	}
	
	@PostMapping("/makepayment")
	public Object makepayment(@ModelAttribute(name="cardDatails") CardDetails cardDetails, Model model,  HttpSession session) {
		
		int cust_id = cardDetails.getCust_id();
		int cardID = cardDetails.getCard_id();
		int cardCode = cardDetails.getCard_code();
		double amountToDeduct = cardDetails.getBalance();
		int DB_CardID = 0;
		int DB_CardCode = 0;
		int DB_Cust_ID = 0;
		double DB_Balance = 0;
		String SELECT_SQL = "SELECT * FROM CARD_INFORMATION where CUST_ID = ? AND CARD_ID = ?";
		
		CardDetails newCardDetails = null;
		
		try {
			newCardDetails = jdbcTemplate.queryForObject(SELECT_SQL, new CardDetailsRowMapper(), cust_id, cardID);
		} catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		if(newCardDetails == null) {
			model.addAttribute("error", true);
			model.addAttribute("errorMessage", "UserNotAvailable");
			return newCardDetails;
		}
		
		DB_CardID =newCardDetails.getCard_id();
		DB_CardCode =newCardDetails.getCard_code();
		DB_Cust_ID = newCardDetails.getCust_id();
		DB_Balance = newCardDetails.getBalance();
			
		if(DB_CardID == cardID && DB_CardCode == cardCode && DB_Cust_ID == cust_id) {
			if(DB_Balance >=  amountToDeduct) {
				double newBalance = DB_Balance - amountToDeduct;
				manageCardService.makePayment(cardDetails, newBalance, amountToDeduct);
				try {
					newCardDetails = jdbcTemplate.queryForObject(SELECT_SQL, new CardDetailsRowMapper(), cust_id, cardID);
				} catch(DataAccessException dae) {
					dae.printStackTrace();
				}
				
				return newCardDetails;
				}
			else {
				return "Insufficient Balance..!!";
			}
		}
		else {
			model.addAttribute("error", true);
			model.addAttribute("errorMessage", "InvalidCredential");
			return null;
		}
	}
}