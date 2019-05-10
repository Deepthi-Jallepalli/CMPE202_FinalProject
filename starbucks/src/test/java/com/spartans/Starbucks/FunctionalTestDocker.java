package com.spartans.Starbucks;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class FunctionalTestDocker {
	@BeforeClass
    public static void setup() {
        String port = System.getProperty("server.port");
        if (port == null) {
            RestAssured.port = Integer.valueOf(80);
        }
        else{
            RestAssured.port = Integer.valueOf(port);
        }

        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://www.sudhaaws.com";
        }
        RestAssured.baseURI = baseHost;

    }


}
