/**
 * 
 */
package com.spartans.Starbucks.service;

/**
 * @author musahay
 *
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spartans.Starbucks.dao.CardDetails;
import com.spartans.Starbucks.dao.CardDetailsDAO;

@Service
public class ManageCardService {

	@Autowired
	private CardDetailsDAO cardDetailsDAO;
	
	@Autowired 
	JdbcTemplate jdbcTemplate;

	
	public List<CardDetails> getAllCards() {
		
		List<CardDetails> cardDetails = new ArrayList<>();
		cardDetailsDAO.findAll().forEach(cardDetails::add);
		return cardDetails;
		
	}
	
	
	public CardDetails getCardDetails(int cust_id) {

		return cardDetailsDAO.findById(cust_id).orElse(null);
		
	}
	

	public void addCard(CardDetails carddetails) {
		cardDetailsDAO.save(carddetails);
	}
	
	
public void addBalance(CardDetails carddetails, double newBalance) {
				
		Connection connection = null;		
		String UPDT_SQL = "UPDATE CARD_INFORMATION SET BALANCE = ? where CARD_ID=? AND CUST_ID=?";		
		
		try{
			
		connection = jdbcTemplate.getDataSource().getConnection();
		PreparedStatement preparedstatement = connection.prepareStatement(UPDT_SQL);
		preparedstatement.setDouble(1, newBalance);
		preparedstatement.setInt(2, carddetails.getCard_id());
		preparedstatement.setInt(3, carddetails.getCust_id());
		
		preparedstatement.executeUpdate();
		preparedstatement.close();
		
		}catch (SQLException e) {

            throw new RuntimeException(e);

        } finally {
            if (connection != null) {
                try {
                	connection.close();
                } catch (SQLException e) {}

            }
        }
}
}