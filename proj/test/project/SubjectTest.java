

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Subject;

class SubjectTest {

	@Test
	  public void testcheckFullmark1() {
       
        String mark = "200";
        Subject instance = new Subject();
        assertTrue(instance.checkFullmark(mark));
    }
	@Test
	 public void testcheckFullmark2() {
	       
	        String mark = "100";
	        Subject instance = new Subject();
	        assertFalse(instance.checkFullmark(mark));
	    }
	@Test
	 public void testcheckFullmark3() {
	     
	        String mark = "-1";
	        Subject instance = new Subject();
	        assertTrue(instance.checkFullmark(mark));
	    }
	
	  @Test
	    public void testcheckSubjectName1() {
	      
	        String name = "abc123";
	        Subject instance = new Subject();
	       
	        // TODO review the generated test code and remove the default call to fail.
	        assertTrue( instance.checkSubjectName(name));
	    }
	  
	  @Test
	    public void testcheckSubjectName2() {
	        
	        String name = "abc";
	        Subject instance = new Subject();
	        instance.checkSubjectName(name);
	        // TODO review the generated test code and remove the default call to fail.
	        assertFalse( instance.checkSubjectName(name));
	    }
	  
	  @Test
	    public void testcheckcode1() {
	       
	        String code = "ENG10111";
	        Subject instance = new Subject();
	        
	        // TODO review the generated test code and remove the default call to fail.
	        assertTrue(instance.checkcode(code));
	    
	  }
	  
	  
	  @Test
	    public void testcheckcode2() {
	       
	        String code = "ENG101";
	        Subject instance = new Subject();
	        
	        // TODO review the generated test code and remove the default call to fail.
	        assertFalse(instance.checkcode(code));
	    
	  }

}
