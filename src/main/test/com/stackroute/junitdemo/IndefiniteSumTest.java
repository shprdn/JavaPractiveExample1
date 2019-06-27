package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class IndefiniteSumTest {
        IndefiniteSum rev = null;
        @Before
        public void setUp(){
            rev= new IndefiniteSum();
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
        public void givenNumShouldReturnInvalid(){
            String a[] ={"1","2","3","0"};
            String result= rev.summation(a);
            //assert
            assertEquals("6",result);
        }
        @Test
        public void givenNumShouldReturnError(){
         String b[] = {"1", "2","e", "0"};
        String result= rev.summation(b);
        //assert
        assertEquals("error",result);
    }


}