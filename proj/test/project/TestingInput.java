

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import application.Subject;
import org.junit.jupiter.api.Test;

class TestingInput {
	
	@Test
	public void tester() {
	 
        try {
     String expectedData = "English,G101,100 John Doe,12345678,8,9,18,50 Jane Smith,23456789,10,8,17,52 Bjo Johnson,34567890,9,10,20,55 Alice Lee,45678901,7,6,16,45 Tom Brown,56789012,8,7,18,48 Sara Davis,67890123,10,9,19,58 David Wilson,78901234,9,8,17,53 ";
  	        
      	      BufferedReader br = null;
              FileReader fr = null;
			  fr = new FileReader("test1.txt");
			  br = new BufferedReader(fr);
		      String data = "";
		      int l=1;
		         String sCurrentLine = "";
		         while ((sCurrentLine = br.readLine()) != null) {
		        	 
		        		 data+=sCurrentLine;        	
		        	
		        	 data+=" ";
		         }   
		         
			    assertEquals(expectedData, data);
			//	fail("Not yet implemented");

		} catch (Exception e) {
	          e.printStackTrace();
	       }
      
	}


}
