package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class SeriesFormationTest {
    SeriesFormation sf;
    @Before
    public void setUp(){
        sf = new SeriesFormation();
    }

    @After
    public void tearDown() {
        sf = null;
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
    public void givenNumShouldReturnSeries(){
        //arrange

        //act
        String result= sf.pattern(5);
        //assert
        assertEquals("122333444455555",result);
    }
}