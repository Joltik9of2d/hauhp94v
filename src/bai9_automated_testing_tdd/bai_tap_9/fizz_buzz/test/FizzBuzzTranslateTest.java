package bai9_automated_testing_tdd.bai_tap_9.fizz_buzz.test;

import bai9_automated_testing_tdd.bai_tap_9.fizz_buzz.src.FizzBuzzTranslate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void test12() {
        int number = 12;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    void test20() {
        int number = 20;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    void test15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    void test16() {
        int number = 16;
        String expected = "mot sau ";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    void test434() {
        int number = 434;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    void test454() {
        int number = 454;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    void test26() {
        int number = 26;
        String expected = "hai sau ";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
}