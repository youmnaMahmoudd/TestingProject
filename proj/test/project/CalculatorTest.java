package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testSetGrade_APlus() {
        Calculator calculator = new Calculator();
        calculator.setGrade(97);
        Assertions.assertEquals("A+", calculator.getGrade());
    }

    @Test
    public void testSetGrade_A() {
        Calculator calculator = new Calculator();
        calculator.setGrade(93);
        Assertions.assertEquals("A", calculator.getGrade());
    }

    @Test
    public void testSetGrade_AMinus() {
        Calculator calculator = new Calculator();
        calculator.setGrade(89);
        Assertions.assertEquals("A-", calculator.getGrade());
    }

    @Test
    public void testSetGrade_BPlus() {
        Calculator calculator = new Calculator();
        calculator.setGrade(84);
        Assertions.assertEquals("B+", calculator.getGrade());
    }

    @Test
    public void testSetGrade_B() {
        Calculator calculator = new Calculator();
        calculator.setGrade(80);
        Assertions.assertEquals("B", calculator.getGrade());
    }

    @Test
    public void testSetGrade_BMinus() {
        Calculator calculator = new Calculator();
        calculator.setGrade(76);
        Assertions.assertEquals("B-", calculator.getGrade());
    }

    @Test
    public void testSetGrade_CPlus() {
        Calculator calculator = new Calculator();
        calculator.setGrade(73);
        Assertions.assertEquals("C+", calculator.getGrade());
    }

    @Test
    public void testSetGrade_C() {
        Calculator calculator = new Calculator();
        calculator.setGrade(70);
        Assertions.assertEquals("C", calculator.getGrade());
    }

    @Test
    public void testSetGrade_CMinus() {
        Calculator calculator = new Calculator();
        calculator.setGrade(67);
        Assertions.assertEquals("C-", calculator.getGrade());
    }

    @Test
    public void testSetGrade_DPlus() {
        Calculator calculator = new Calculator();
        calculator.setGrade(64);
        Assertions.assertEquals("D+", calculator.getGrade());
    }

    @Test
    public void testSetGrade_D() {
        Calculator calculator = new Calculator();
        calculator.setGrade(60);
        Assertions.assertEquals("D", calculator.getGrade());
    }

    @Test
    public void testSetGrade_F() {
        Calculator calculator = new Calculator();
        calculator.setGrade(59);
        Assertions.assertEquals("F", calculator.getGrade());
    }

    @Test
    public void testSetGPA_A() {
        Calculator calculator = new Calculator();
        calculator.setGPA(97);
        Assertions.assertEquals(4.0, calculator.getGPA());
    }

    @Test
    public void testSetGPA_APlus() {
        Calculator calculator = new Calculator();
        calculator.setGPA(93);
        Assertions.assertEquals(4.0, calculator.getGPA());
    }

    @Test
    public void testSetGPA_AMinus() {
        Calculator calculator = new Calculator();
        calculator.setGPA(89);
        Assertions.assertEquals(3.7, calculator.getGPA());
    }

    @Test
    public void testSetGPA_B() {
        Calculator calculator = new Calculator();
        calculator.setGPA(80);
        Assertions.assertEquals(3.0, calculator.getGPA());
    }

    @Test
    public void testSetGPA_BPlus() {
        Calculator calculator = new Calculator();
        calculator.setGPA(84);
        Assertions.assertEquals(3.3, calculator.getGPA());
    }

    @Test
    public void testSetGPA_BMinus() {
        Calculator calculator = new Calculator();
        calculator.setGPA(76);
        Assertions.assertEquals(2.7, calculator.getGPA());
    }

    @Test
    public void testSetGPA_C() {
        Calculator calculator = new Calculator();
        calculator.setGPA(70);
        Assertions.assertEquals(2.0, calculator.getGPA());
    }

    @Test
    public void testSetGPA_CPlus() {
        Calculator calculator = new Calculator();
        calculator.setGPA(73);
        Assertions.assertEquals(2.3, calculator.getGPA());
    }

    @Test
    public void testSetGPA_CMinus() {
        Calculator calculator = new Calculator();
        calculator.setGPA(67);
        Assertions.assertEquals(1.7, calculator.getGPA());
    }

    @Test
    public void testSetGPA_D() {
        Calculator calculator = new Calculator();
        calculator.setGPA(60);
        Assertions.assertEquals(1.0, calculator.getGPA());
    }

    @Test
    public void testSetGPA_DPlus() {
        Calculator calculator = new Calculator();
        calculator.setGPA(64);
        Assertions.assertEquals(1.3, calculator.getGPA());
    }


    @Test
    public void testSetGPA_F() {
        Calculator calculator = new Calculator();
        calculator.setGPA(59);
        Assertions.assertEquals(0.0, calculator.getGPA());
    }

    @Test
    public void testSetGradeInvalid() {
        Calculator calculator = new Calculator();

        // Set an invalid grade
        calculator.setGrade(-1);

        // Check that the grade is not set
        Assertions.assertEquals("F", calculator.getGrade());
    }

    @Test
    public void testSetGPAInvalid() {
        Calculator calculator = new Calculator();

        // Set an invalid GPA
        calculator.setGPA(-1);

        // Check that the GPA is not set
        Assertions.assertEquals(0.0, calculator.getGPA());
    }
}