package bai9_automated_testing_tdd.bai_tap_9.tinh_ngay_tiep_theo.test;

import bai9_automated_testing_tdd.bai_tap_9.tinh_ngay_tiep_theo.src.NextDayCalculator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void test1Thang1() {
        LocalDate date  = LocalDate.of(2018,1,1);
        LocalDate expected = LocalDate.of(2018,1,2);
        LocalDate result = NextDayCalculator.timNgayHomSau(date);
        assertEquals(expected,result);
    }

    @Test
    void test31thang1() {
        LocalDate date  = LocalDate.of(2018,1,31);
        LocalDate expected = LocalDate.of(2018,2,1);
        LocalDate result = NextDayCalculator.timNgayHomSau(date);
        assertEquals(expected,result);
    }
    @Test
    void test30Thang4() {
        LocalDate date  = LocalDate.of(2018,4,30);
        LocalDate expected = LocalDate.of(2018,5,1);
        LocalDate result = NextDayCalculator.timNgayHomSau(date);
        assertEquals(expected,result);
    }
    @Test
    void test28Thang2() {
        LocalDate date  = LocalDate.of(2018,2,28);
        LocalDate expected = LocalDate.of(2018,3,1);
        LocalDate result = NextDayCalculator.timNgayHomSau(date);
        assertEquals(expected,result);
    }
    @Test
    void test29Thang2() {
        LocalDate date  = LocalDate.of(2020,2,29);
        LocalDate expected = LocalDate.of(2020,3,1);
        LocalDate result = NextDayCalculator.timNgayHomSau(date);
        assertEquals(expected,result);
    }
    @Test
    void test31Thang12() {
        LocalDate date  = LocalDate.of(2018,12,31);
        LocalDate expected = LocalDate.of(2019,1,1);
        LocalDate result = NextDayCalculator.timNgayHomSau(date);
        assertEquals(expected,result);
    }
}