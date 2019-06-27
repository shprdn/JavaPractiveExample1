package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class IntegerSortTest {

        IntegerSort rev;
        @Before
        public void setUp(){
            rev= new IntegerSort();
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
        public void givenNumShouldReturnDec(){
            //arrange

            //act
            String result= rev.sort(41223);
            //assert
            assertEquals("43221 8",result);
        }
        @Test
        public void givenNumShouldFalse(){
            String result= rev.sort(9887);
            //assert
            assertEquals("9887 16 false",result);
        }



    }

