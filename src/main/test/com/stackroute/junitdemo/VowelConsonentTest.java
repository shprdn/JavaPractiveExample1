package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonentTest {
    VowelConsonent sf;
    @Before
    public void setUp(){
        sf = new VowelConsonent();
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
    public void givenNumShouldReturnVowel(){
        //arrange

        //act
        String result= sf.check("a");
        //assert
        assertEquals(" vowel",result);
    }
    @Test
    public void givenNumShouldReturnSeries(){
        //arrange

        //act
        String result= sf.check("ap");
        //assert
        assertEquals(" vowel consonent",result);
    }
    @Test
    public void givenNumShouldReturnConsonent(){
        //arrange

        //act
        String result= sf.check("c");
        //assert
        assertEquals(" consonent",result);
    }
    @Test
    public void givenNumShouldReturnNull(){
        //arrange

        //act
        String result= sf.check(null);
        //assert
        assertEquals("null not allowed",result);
    }
    @Test
    public void givenNumShouldReturnOnlyVowel(){
        //arrange

        //act
        String result= sf.check("aeiou");
        //assert
        assertEquals(" vowel vowel vowel vowel vowel",result);
    }
    @Test
    public void givenNumShouldReturnOnlyConsonent(){
        //arrange

        //act
        String result= sf.check("bcd");
        //assert
        assertEquals(" consonent consonent consonent",result);
    }


}