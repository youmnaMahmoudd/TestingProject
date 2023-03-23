

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Subject;

class SubjectTest {

	@Test
	  public void testSetFullmark1() {
        System.out.println("setFullmark");
        String mark = "200";
        Subject instance = new Subject();
        assertFalse(instance.checkFullmark(mark));
    }
	@Test
	 public void testSetFullmark2() {
	        System.out.println("setFullmark");
	        String mark = "100";
	        Subject instance = new Subject();
	        assertFalse(instance.checkFullmark(mark));
	    }
	@Test
	 public void testSetFullmark3() {
	        System.out.println("setFullmark");
	        String mark = "-1";
	        Subject instance = new Subject();
	        assertFalse(instance.checkFullmark(mark));
	    }
	
	  @Test
	    public void testSetSubjectName1() {
	        System.out.println("setSubjectName");
	        String name = "abc123";
	        Subject instance = new Subject();
	       
	        // TODO review the generated test code and remove the default call to fail.
	        assertFalse( instance.checkSubjectName(name));
	    }
	  
	  @Test
	    public void testSetSubjectName2() {
	        System.out.println("setSubjectName");
	        String name = "abc";
	        Subject instance = new Subject();
	        instance.checkSubjectName(name);
	        // TODO review the generated test code and remove the default call to fail.
	        assertFalse( instance.checkSubjectName(name));
	    }
	  
	  @Test
	    public void testSetcode1() {
	       
	        String code = "ENG10111";
	        Subject instance = new Subject();
	        
	        // TODO review the generated test code and remove the default call to fail.
	        assertFalse(instance.checkcode(code));
	    
	  }
	  
	  
	  @Test
	    public void testSetcode2() {
	       
	        String code = "ENG101";
	        Subject instance = new Subject();
	        
	        // TODO review the generated test code and remove the default call to fail.
	        assertFalse(instance.checkcode(code));
	    
	  }

}
