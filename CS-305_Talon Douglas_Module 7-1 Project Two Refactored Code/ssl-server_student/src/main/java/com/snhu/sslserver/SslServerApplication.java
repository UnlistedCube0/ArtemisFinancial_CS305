package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.time.LocalDate;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

//Added route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class ServerController{
	
    @RequestMapping("/hash")
    public String myHash() throws Exception {

    	String name = "Talon Douglas";
    	String currentDate = LocalDate.now().toString();
    	       
        return 	"<p>Name: Talon Douglas </p>" +
				"<p>Current Date (as String): " + currentDate + "</p>" +
        		"<p>Name of Hash Algorithm: SHA-256 </p>" +
        		"<p>Checksum Value of Name: " + hashBytes(name.getBytes(java.nio.charset.StandardCharsets.UTF_8)) + "</p>" +
        		"<p>Checksum Value of Date: " + hashBytes(currentDate.getBytes(java.nio.charset.StandardCharsets.UTF_8)) + "</p>"; 
        
    }
    
    private static String hashBytes(byte[] data) throws Exception {
    	
    	// Initializes object using SHA-256
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	
    	// Converts data into bytes
    	// Uses digest() method to turn those bytes into a hashed value using SHA-256
    	byte[] hashedBytes = md.digest(data);
    	
    	// Converts the hashed bytes back into readable characters (Hex)
    	String hexString = "";
	     for (byte i : hashedBytes) {
	    	 hexString += String.format("%02X", i);
	     }
	     
	     return hexString;
    }
}