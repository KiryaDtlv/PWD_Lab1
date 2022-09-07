package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void min_isCorrect1() {
        //arrange
        int[] mas = {4,2,3};
        //act
        //assert
        assertEquals(2, MyClass.min(mas));
    }
    @Test
    public void min_isCorrect2() {
        //arrange
        int[] mas = {157,1,15,513};
        //act
        //assert
        assertEquals(1, MyClass.min(mas));
    }
    @Test
    public void min_isCorrect3() {
        //arrange
        int[] mas = {157,-1351,15,513};
        //act
        //assert
        assertEquals(-1351, MyClass.min(mas));
    }
    @Test
    public void min_isCorrect4() {
        //arrange
        int[] mas = {157,1513,15,513};
        //act
        //assert
        assertEquals(15, MyClass.min(mas));
    }
    @Test
    public void max_isCorrect() {
        //arrange
        int[] mas = {4,2,3};
        //act
        //assert
        assertEquals(4, MyClass.max(mas));
    }
    @Test
    public void max_isCorrect2() {
        //arrange
        int[] mas = {157,1,15,513};
        //act
        //assert
        assertEquals(513, MyClass.max(mas));
    }
    @Test
    public void max_isCorrect3() {
        //arrange
        int[] mas = {157,-1351,15,513};
        //act
        //assert
        assertEquals(513, MyClass.max(mas));
    }
    @Test
    public void max_isCorrect4() {
        //arrange
        int[] mas = {157,1513,15,513};
        //act
        //assert
        assertEquals(1513, MyClass.max(mas));
    }

}