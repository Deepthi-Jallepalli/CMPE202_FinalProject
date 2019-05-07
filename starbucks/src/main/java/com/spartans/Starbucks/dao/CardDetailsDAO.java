/**
 * 
 */
package com.spartans.Starbucks.dao;

/**
 * @author musahay
 *
 */

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CardDetailsDAO extends CrudRepository<CardDetails,Integer> {

	List<CardDetails> findAll();
	 
    //Optional<CustomerDetails> findById(Integer cust_id);	
}