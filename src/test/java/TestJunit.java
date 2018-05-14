package test.java;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import main.java.*;

public class TestJunit {
	
	@Test
	public void someTestApi() {
	
		
		System.out.println("test geht");
        //assertEquals( expectedResult, api.toString());
    }
	
    @Test
    public void someTestParcel() {
    	System.out.println("test geht 2");
    }
    
  

}
