package com.bootcampexercise.module9.activity;

//import com.bootcampexercise.module9.sample.MyCalculator;
import com.bootcampexercise.module9.sample.Product;
import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    protected void setUp() throws Exception {
        person = new Person();
    }

    //TODO: create set up

    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }
    //TODO: create teardown

    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight() {
        int testWeight = 150;
        assertNull(person.getWeight());
        person.setWeight(testWeight);
        assertEquals(testWeight, person.getWeight());
    }

    public void testSetAndGetHeight() {
        int testHeight = 128;
        assertEquals(null, person.getHeight());
        assertNull(person.getHeight());
        person.setHeight(testHeight);
        assertEquals(testHeight, person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method
//    public void testThrowException(){
//
//        try {
//
//            theCalculator.getSum(2, 1);
//            theCalculator.getDifference(3, 3);
//            theCalculator.getProduct(0, 1);
//            theCalculator.getQuotient(1, 0);
//            new MyCalculator();
//
//        } catch (Exception e) {
//            fail();
//        }
//        catch (Error e) {
//            fail();
//        }
//    }
}
