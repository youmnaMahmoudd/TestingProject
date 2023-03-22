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

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnumber method, of class Student.
     */
    @Test
    public void testGetnumber() {
        System.out.println("getnumber");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getnumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setnumber method, of class Student.
     */
    @Test
    public void testSetnumber() {
        System.out.println("setnumber");
        String Studentnumber = "";
        Student instance = new Student();
        instance.setnumber(Studentnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOralmark method, of class Student.
     */
    @Test
    public void testSetOralmark() {
        System.out.println("setOralmark");
        int mark = 0;
        Student instance = new Student();
        instance.setOralmark(mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMidtermmark method, of class Student.
     */
    @Test
    public void testSetMidtermmark() {
        System.out.println("setMidtermmark");
        int mark = 0;
        Student instance = new Student();
        instance.setMidtermmark(mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFinalmark method, of class Student.
     */
    @Test
    public void testSetFinalmark() {
        System.out.println("setFinalmark");
        int mark = 0;
        Student instance = new Student();
        instance.setFinalmark(mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentActivitiesmark method, of class Student.
     */
    @Test
    public void testSetStudentActivitiesmark() {
        System.out.println("setStudentActivitiesmark");
        int mark = 0;
        Student instance = new Student();
        instance.setStudentActivitiesmark(mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGPA method, of class Student.
     */
    @Test
    public void testGetGPA() {
        System.out.println("getGPA");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGPA();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
