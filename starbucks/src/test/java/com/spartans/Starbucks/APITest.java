package com.spartans.Starbucks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import java.util.Random;

import static io.restassured.RestAssured.given;
import org.junit.Test;


public class APITest extends FunctionalTest {
	String signupEmail ="test17@test17gmail.com";
	String signupFirstName ="test17";
	String signupLastName ="test17";
	
	String signupCity ="test17city";
	String signupState ="test17state";
	String signupPassword ="test17";
	
	int CardID = 10000 + new Random().nextInt(90000);
	int CardCode = 100 + new Random().nextInt(900);
	int balance = 80;
	int CustomerID = 13;

	@Test
	public void PingTest1() {
		given().when().get("/login").then().statusCode(200);
	}
	@Test
	public void PingTest2() {
		given().when().get("/signup").then().statusCode(200);
	}
	@Test
	public void PingTest3() {
		given().when().get("/addcard").then().statusCode(200);
	}
	@Test
	public void PingTest4() {
		given().when().get("/makepayment").then().statusCode(200);
	}
	@Test
	public void PingTest5() {
		given().when().get("/history?cust_id=200").then().statusCode(200);
	}
	@Test
	public void PingTest6() {
		given().when().get("/addbalance").then().statusCode(200);
	}
	@Test
	public void SignupTest() {
		given()
		.when()
		.post("/signup?email="+signupEmail+"&first_name="+signupFirstName+"&last_name="+signupLastName+"&city="+signupCity+"&state="+signupState+"&password="+signupPassword)
		.then()
		.statusCode(200)
		.body("first_name", equalTo(signupFirstName))
		.body("last_name", equalTo(signupLastName))
		.body("email", equalTo(signupEmail))
		.body("city", equalTo(signupCity))
		.body("state", equalTo(signupState))
		.body("password", equalTo(signupPassword));
	}
	@Test
	public void LoginTest() {
		given()
		.when()
		.post("login?email=test13@test13.com&password=test13")
		.then()
		.statusCode(200)
		.body("cust_id", equalTo(16))
		.body("first_name", equalTo("test13"))
		.body("last_name", equalTo("test13"))
		.body("email", equalTo("test13@test13.com"))
		.body("city", equalTo("test13city"))
		.body("state", equalTo("test13state"))
		.body("password", equalTo("test13"));
	}
	@Test
	public void AddCardTest() {
		given()
		.when()
		.post("/addcard?cust_id="+CustomerID+"&card_id="+CardID+"&card_code="+CardCode+"&balance="+balance)
		.then()
		.statusCode(200)
		.body("cust_id", equalTo(CustomerID))
		.body("card_id", equalTo(CardID))
		.body("card_code", equalTo(CardCode))
		.body("balance", equalTo(80.0f));
	}
	@Test
	public void ManageOrdersTest() {
		given()
		.when()
		.get("/history?cust_id=10")
		.then().statusCode(200)
		.body("[0].TRANSACTION_ID", equalTo(7))
		.body("[0].CUST_ID", equalTo(10))
		.body("[0].CARD_ID", equalTo(123456783))
		.body("[0].TRANSACTION_TIME", equalTo("2019-05-10T05:04:46.000+0000"))
		.body("[0].PAYMENT_AMOUNT", equalTo(20.0f))
		.body("[1].TRANSACTION_ID", equalTo(8))
		.body("[1].CUST_ID", equalTo(10))
		.body("[1].CARD_ID", equalTo(123456783))
		.body("[1].TRANSACTION_TIME", equalTo("2019-05-10T06:30:42.000+0000"))
		.body("[1].PAYMENT_AMOUNT", equalTo(20.0f))
		.body("[4].TRANSACTION_ID", equalTo(11))
		.body("[4].CUST_ID", equalTo(10))
		.body("[4].CARD_ID", equalTo(123456783))
		.body("[4].TRANSACTION_TIME", equalTo("2019-05-10T07:45:02.000+0000"))
		.body("[4].PAYMENT_AMOUNT", equalTo(20.0f));
	}
}
