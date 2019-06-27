package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rev;
    @Before
    public void setUp(){
        rev= new ReverseString();
    }
    @After
    public void tearDown(){
        rev = null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before class");

    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("After class");

    }
    @Test
    public void givenNumShouldReturnReverse(){
        //arrange

        //act
        String result= rev.check("london");
        //assert
        assertEquals("nodnol",result);
    }
    @Test
    public void givenNumShouldReturnInvalid(){
        String result= rev.check(null);
        //assert
        assertEquals("null not allowed",result);
    }
}