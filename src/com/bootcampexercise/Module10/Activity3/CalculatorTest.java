package com.bootcampexercise.Module10.Activity3;
import junit.framework.TestCase;
public class CalculatorTest extends TestCase{
    private Calculator theCalculator;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        theCalculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        theCalculator = null;
        super.tearDown();
    }
    public void testSumI() {

        int a = 5;
        int b = 10;
        //	Checks the sum of two (2) positive values
        assertEquals(15, (theCalculator.sum(a,b)));
        assertEquals(15, (theCalculator.sum(b,a)));

        a = -5;
        b = 15;
        //	Checks the sum of a postive value and a negative value
        assertEquals(10, (theCalculator.sum(a,b)));
        assertEquals(10, (theCalculator.sum(b,a)));

        a = -5;
        b = -10;
        //	Checks the sum of two (2) negative values
        assertEquals(-15, (theCalculator.sum(a,b)));
        assertEquals(-15, (theCalculator.sum(b,a)));
    }
    public void testSumD() {

        double c = 523.21;
        double d = 10.5;
        //	Checks the sum of two (2) positive values
        assertEquals(533.71, (theCalculator.sum(c,d)));
        assertEquals(533.71, (theCalculator.sum(d,c)));

        c = -523.21;
        d = -10.5;
        //	Checks the sum of two (2) negative values
        assertEquals(-533.71, (theCalculator.sum(c,d)));
        assertEquals(-533.71, (theCalculator.sum(d,c)));

        c = -523.21;
        d = 10.5;
        //	Checks the sum of a postive value and a negative value
        assertEquals(-512.71, (theCalculator.sum(c,d)));
        assertEquals(-512.71, (theCalculator.sum(d,c)));

        c = 523.21;
        d = -10.5;
        //	Checks the sum of a postive value and a negative value
        assertEquals(512.71, (theCalculator.sum(c,d)));
        assertEquals(512.71, (theCalculator.sum(c,d)));
    }
    public void testSubTract() {

        int a = 3;
        int b = 2;
        //	Checks if b is lesser than a
        assertEquals(1, (theCalculator.subTract(a,b)));
        //	Checks if b is greater than a
        assertEquals(-1, (theCalculator.subTract(b,a)));

        a = 5;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(9, (theCalculator.subTract(a,b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-9, (theCalculator.subTract(b,a)));

        a = -10;
        b = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-5, (theCalculator.subTract(a,b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(5, (theCalculator.subTract(b,a)));
    }
    public void testDivideC() {

        double a = 5;
        double b = 10;
        //	Checks the product of two (2) positive values
        assertEquals(0.5, (theCalculator.divide(a, b)), 0);
        assertEquals(2, (theCalculator.divide(b, a)), 0);

        a = -5;
        b = 10;
        //	Checks the product of a positive value and a negative value
        assertEquals(-0.5, (theCalculator.divide(a, b)), 0);
        assertEquals(-2, (theCalculator.divide(b, a)), 0);
    }
    public void testDivideI() {
        double a = 0;
        double b = 10;
        //	Checks the product of a positive value and a negative value
        assertEquals(0, (theCalculator.divide(a, b)), 0);
        assertEquals(0, (theCalculator.divide(b, a)), 0);

    }

    public void testMultiply() {

        double a = 10;
        double b = 5;
        //	Checks if b is lesser than a
        assertEquals(50, (theCalculator.multiply(a,b)),0);
        //	Checks if b is greater than a
        assertEquals(50, (theCalculator.multiply(b,a)),0);

        a = 9;	b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-27, (theCalculator.multiply(a,b)),0);
        //	Checks if negative value is divided with positive value
        assertEquals(-27, (theCalculator.multiply(b,a)),0.007);

        a = -10;	b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(50, (theCalculator.multiply(a,b)),0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(50, (theCalculator.multiply(b,a)),0);
    }



}
