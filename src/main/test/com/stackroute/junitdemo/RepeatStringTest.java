package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatStringTest {
    RepeatString ch;
    @Before
    public void setUp(){
        ch = new RepeatString();
    }

    @After
    public void tearDown() {
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
    public void givenStringShouldReturn(){
        //arrange

        //act
        String result= ch.repeat("stackroute",2);
        //assert
        assertEquals("stackroutete",result);
    }

}