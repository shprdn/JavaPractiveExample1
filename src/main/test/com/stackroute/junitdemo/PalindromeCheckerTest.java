package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {
    PalindromeChecker pc;

    @Before
    public void setUp() {
        pc = new PalindromeChecker();
    }

    @After
    public void tearDown() {
        pc = null;
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
    public void givenNumShouldReturnPalindrome() {
        //arrange

        //act
        String result = pc.check(1221);
        //assert
        assertEquals("1221 is palindrome and the sum of even numbers is less than 25", result);
    }

    @Test
    public void givenNumShouldReturnInvalid() {
        String result = pc.check(7654);
        //assert
        assertEquals("7654 is not pallindrome", result);

    }
    @Test
    public void givenNumShouldReturnSum() {
        String result = pc.check(88888);
        //assert
        assertEquals("88888 is palindrome and the sum of even numbers is greater than 25", result);

    }
}