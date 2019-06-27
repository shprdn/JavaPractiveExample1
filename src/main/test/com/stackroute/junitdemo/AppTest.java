package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {
    App app;
    @Before
    public void setUp(){

            System.out.println("Before");
            app = new App();
        }

    @After
    public void tearDown(){
        System.out.println("After");
        app=null;

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
    public void givenTwoStringShouldReturnConcatenatedUpperString(){
        //arrange

        //act
        String result= app.concatAndConvertString("Hello","World");
        //assert
        assertEquals("HELLOWORLD",result);
    }
    @Test
    public void givenTwoStringShouldReturnErrorMessage(){
        //arrange

        //act
        String result= app.concatAndConvertString(null,null);
        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenOneoStringShouldReturnErrorMessage(){
        //arrange

        //act
        String result= app.concatAndConvertString("Hello",null);
        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenOneEmptyShouldReturnErrorMessage(){
        //arrange

        //act
        String result= app.concatAndConvertString("","3");
        //assert
        assertEquals("3",result);
    }


}