/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Omar
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
//    /**
//     * Test of setFullmark method, of class Subject.
//     */
//    @Test
//    public void testSetFullmark() {
//        System.out.println("setFullmark");
//        String mark = "50";
//        Subject instance = new Subject();
//        // TODO review the generated test code and remove the default call to fail.
//        assertTrue("failure - should be true", (instance.setFullmark(mark)));
////        fail("The test case is a prototype.");
//    }
    /**
     * Test of checkErrorName method, of class Student.
     */
    @Test
    public void testCheckErrorName1() {
        // CORRECT NAME
        System.out.println("checkErrorName - 1");
        String name = "Ahmed";
        Student instance = new Student();
        boolean result = instance.checkErrorName(name);
        assertFalse("failure - should be false", result);
    }

        /**
     * Test of checkErrorName method, of class Student.
     */
    @Test
    public void testCheckErrorName2() {
        // ERROR NAME
        System.out.println("checkErrorName - 2");
        String name = "Ahmed123";
        Student instance = new Student();
        boolean result = instance.checkErrorName(name);
        // RESULT SHOULD BE TRUE AS NAME HAS ERROR
        assertTrue("failure - should be true", result);
    }
            /**
     * Test of checkErrorName method, of class Student.
     */
    @Test
    public void testCheckErrorName3() {
        // ERROR NAME
        System.out.println("checkErrorName - 3");
        String name = " Ahmed";
        Student instance = new Student();
        boolean result = instance.checkErrorName(name);
        // RESULT SHOULD BE TRUE AS NAME HAS ERROR
        assertTrue("failure - should be true", result);
    }
    
                /**
     * Test of checkErrorName method, of class Student.
     */
    @Test
    public void testCheckErrorName4() {
        // CORRECT NAME
        System.out.println("checkErrorName - 4");
        String name = "Ahmed Mohamed";
        Student instance = new Student();
        boolean result = instance.checkErrorName(name);
        // RESULT SHOULD BE TRUE AS NAME HAS ERROR
        assertFalse("failure - should be false", result);
    }
    
    
    /**
     * Test of checkErrorNumber method, of class Student.
     */
    @Test
    public void testCheckErrorNumber1() {
        System.out.println("checkErrorNumber - 1");
        String Studentnumber = "12345678";
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorNumber(Studentnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkErrorNumber method, of class Student.
     */
    @Test
    public void testCheckErrorNumber2() {
        System.out.println("checkErrorNumber - 2");
        String Studentnumber = "1234567";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorNumber(Studentnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorNumber method, of class Student.
     */
    @Test
    public void testCheckErrorNumber3() {
        System.out.println("checkErrorNumber - 3");
        String Studentnumber = "1234567s";
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorNumber(Studentnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorNumber method, of class Student.
     */
    @Test
    public void testCheckErrorNumber4() {
        System.out.println("checkErrorNumber - 4");
        String Studentnumber = "12345678212";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorNumber(Studentnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkErrorOralmark method, of class Student.
     */
    @Test
    public void testCheckErrorOralmark1() {
        System.out.println("checkErrorOralmark - 1");
        int mark = -1;
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorOralmark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorOralmark method, of class Student.
     */
    @Test
    public void testCheckErrorOralmark2() {
        System.out.println("checkErrorOralmark - 2");
        int mark = 10;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorOralmark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorOralmark method, of class Student.
     */
    @Test
    public void testCheckErrorOralmark3() {
        System.out.println("checkErrorOralmark - 3");
        int mark = 5;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorOralmark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkErrorMidtermmark method, of class Student.
     */
    @Test
    public void testCheckErrorMidtermmark1() {
        System.out.println("checkErrorMidtermmark - 1");
        int mark = 11;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorMidtermmark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorMidtermmark method, of class Student.
     */
    @Test
    public void testCheckErrorMidtermmark2() {
        System.out.println("checkErrorMidtermmark - 2");
        int mark = -2;
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorMidtermmark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorMidtermmark method, of class Student.
     */
    @Test
    public void testCheckErrorMidtermmark3() {
        System.out.println("checkErrorMidtermmark - 3");
        int mark = 25;
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorMidtermmark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkErrorFinalMark method, of class Student.
     */
    @Test
    public void testCheckErrorFinalMark1() {
        System.out.println("checkErrorFinalMark - 1");
        int mark = 61;
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorFinalMark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorFinalMark method, of class Student.
     */
    @Test
    public void testCheckErrorFinalMark2() {
        System.out.println("checkErrorFinalMark - 2");
        int mark = 52;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorFinalMark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorFinalMark method, of class Student.
     */
    @Test
    public void testCheckErrorFinalMark3() {
        System.out.println("checkErrorFinalMark - 3");
        int mark = -1;
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorFinalMark(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkErrorStudentActiv method, of class Student.
     */
    @Test
    public void testCheckErrorStudentActiv1() {
        System.out.println("checkErrorStudentActiv - 1");
        int mark = -1;
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.checkErrorStudentActiv(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorStudentActiv method, of class Student.
     */
    @Test
    public void testCheckErrorStudentActiv2() {
        System.out.println("checkErrorStudentActiv - 2");
        int mark = 0;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorStudentActiv(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        /**
     * Test of checkErrorStudentActiv method, of class Student.
     */
    @Test
    public void testCheckErrorStudentActiv3() {
        System.out.println("checkErrorStudentActiv - 3");
        int mark = 6;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.checkErrorStudentActiv(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
