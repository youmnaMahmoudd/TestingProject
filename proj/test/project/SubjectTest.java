/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
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
public class SubjectTest {
    
    public SubjectTest() {
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
     * Test of getdata method, of class Subject.
     */
    @Test
    public void testGetdata() {
        System.out.println("getdata");
        Subject instance = new Subject();
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getdata();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsubjectName method, of class Subject.
     */
    @Test
    public void testGetsubjectName() {
        System.out.println("getsubjectName");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.getsubjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsubjectcode method, of class Subject.
     */
    @Test
    public void testGetsubjectcode() {
        System.out.println("getsubjectcode");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.getsubjectcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFullmark method, of class Subject.
     */
    @Test
    public void testSetFullmark() {
        System.out.println("setFullmark");
        String mark = "";
        Subject instance = new Subject();
        instance.setFullmark(mark);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubjectName method, of class Subject.
     */
    @Test
    public void testSetSubjectName() {
        System.out.println("setSubjectName");
        String name = "";
        Subject instance = new Subject();
        instance.setSubjectName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcode method, of class Subject.
     */
    @Test
    public void testSetcode() {
        System.out.println("setcode");
        String name = "";
        Subject instance = new Subject();
        instance.setcode(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdata method, of class Subject.
     */
    @Test
    public void testSetdata() {
        System.out.println("setdata");
        ArrayList<Student> students = null;
        Subject instance = new Subject();
        instance.setdata(students);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddStudent method, of class Subject.
     */
    @Test
    public void testAddStudent() {
        System.out.println("AddStudent");
        Student f = null;
        Subject instance = new Subject();
        instance.AddStudent(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Subject.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pStudents method, of class Subject.
     */
    @Test
    public void testPStudents() {
        System.out.println("pStudents");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.pStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
