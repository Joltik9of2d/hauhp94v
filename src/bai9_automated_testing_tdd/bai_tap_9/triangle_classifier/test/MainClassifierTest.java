package bai9_automated_testing_tdd.bai_tap_9.triangle_classifier.test;

import bai9_automated_testing_tdd.bai_tap_9.triangle_classifier.src.TriangleClassifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainClassifierTest {
    @Test
    void testTamGiacDeu222() {
        float canh1 = 2;
        float canh2 = 2;
        float canh3 = 2;
        String expected = "Tam giac deu";
        String result = TriangleClassifier.phanLoaiTamGiac(2,2,2);
        assertEquals(expected, result);
    }@Test
    void testTamGiacCan223() {
        float canh1 = 2;
        float canh2 = 2;
        float canh3 = 3;
        String expected = "Tam giac can";
        String result = TriangleClassifier.phanLoaiTamGiac(2,2,3);
        assertEquals(expected, result);
    }
    @Test
    void testTamGiacThuong345() {
        float canh1 = 3;
        float canh2 = 4;
        float canh3 = 5;
        String expected =  "Tam giac thuong";
        String result = TriangleClassifier.phanLoaiTamGiac(3,4,5);
        assertEquals(expected, result);
    }
    @Test
    void testKhongPhaiTamGiac823() {
        float canh1 = 8;
        float canh2 = 2;
        float canh3 = 3;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.phanLoaiTamGiac(8,2,3);
        assertEquals(expected, result);
    }
    @Test
    void testKhongPhaiTamGiacAm121() {
        float canh1 = -1;
        float canh2 = 2;
        float canh3 = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.phanLoaiTamGiac(-1,2,1);
        assertEquals(expected, result);
    }
    @Test
    void testKhongPhaiTamGiac011() {
        float canh1 = 0;
        float canh2 = 1;
        float canh3 = 1;
        String expected = "Khong phai tam giac";
        String result = TriangleClassifier.phanLoaiTamGiac(0,1,1);
        assertEquals(expected, result);
    }
}

