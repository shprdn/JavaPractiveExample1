package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class CaseCheckerTest {
    CaseChecker input;
    @Before
    public void setUp(){
        input = new CaseChecker();

    }
    @After
    public void tearDown(){
        input=null;
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
    public void givenCapitalShouldReturnErrorMessage(){
        String result=input.check("A");
        assertEquals("capital letter",result);

    }
    @Test
    public void givenSmallShouldReturnErrorMessage(){
        String result=input.check("b");
        assertEquals("small letter",result);

    }
    @Test
    public void givenDigitShouldReturnErrorMessage(){
        String result=input.check("5");
        assertEquals("digit",result);

    }
    @Test
    public void givenSpecialCharacterShouldReturnErrorMessage(){
        String result=input.check("{");
        assertEquals("special character",result);

    }



}