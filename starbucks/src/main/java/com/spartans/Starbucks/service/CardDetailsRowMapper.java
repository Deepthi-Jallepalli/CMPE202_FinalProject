/**
 * 
 */
package com.spartans.Starbucks.service;

/**
 * @author musahay
 *
 */

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spartans.Starbucks.dao.CardDetails;

public class CardDetailsRowMapper implements RowMapper<CardDetails> {

	@Override
	public CardDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(rowNum + " test test test test");
		CardDetails cardDetails = new CardDetails();
		cardDetails.setCard_id(rs.getInt("CARD_ID"));
		cardDetails.setCard_code(rs.getInt("CARD_CODE"));
		cardDetails.setCust_id(rs.getInt("CUST_ID"));
		cardDetails.setBalance(rs.getFloat("BALANCE"));
		
		return cardDetails;
	}
}