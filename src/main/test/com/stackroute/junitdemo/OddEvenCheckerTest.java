package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class OddEvenCheckerTest {
    OddEvenChecker ch;
    @Before
    public void setUp(){
        ch = new OddEvenChecker();
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
        public void givenNumShouldReturnJerry(){
            //arrange

            //act
            String result= ch.check(4);
            //assert
            assertEquals("Jerry",result);
        }
        @Test
        public void givenNumShouldReturnTom(){
            //arrange

            //act
            String result= ch.check(5);
            //assert
            assertEquals("Tom",result);
        }
    @Test
    public void givenNumShouldReturnInvalid(){
        //arrange

        //act
        String result= ch.check(-1);
        //assert
        assertEquals("invalid",result);
    }



    }

