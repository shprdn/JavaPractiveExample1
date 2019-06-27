package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class IntegerCheckerTest {
    IntegerChecker ch = new IntegerChecker();
    @Before
    public void setUp(){

        System.out.println("Before");

    }

    @After
    public void tearDown(){
        System.out.println("After");
        ch = null;

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
    public void givenOneNumShouldReturnOriginal(){
        //arrange

        //act
        String result= ch.guessNum(4);
        //assert
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void givenOneNumShouldReturnLess(){
        //arrange

        //act
        String result= ch.guessNum(0);
        //assert
        assertEquals("Number guessed is less than original number",result);
    }
    @Test
    public void givenOneNumShouldReturnMore(){
        //arrange

        //act
        String result= ch.guessNum(1000);
        //assert
        assertEquals("Number guessed is more than original number",result);
    }



}