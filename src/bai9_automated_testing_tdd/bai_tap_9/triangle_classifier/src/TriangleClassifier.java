package bai9_automated_testing_tdd.bai_tap_9.triangle_classifier.src;

public class TriangleClassifier {
    public static String phanLoaiTamGiac(float canh1, float canh2, float canh3) {
        if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0) {
            return "Khong phai tam giac";
        } else if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giac deu";
        } else if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
            return "Tam giac can";
        } else if (canh1 + canh2 > canh3 && canh1 + canh3 > canh2 && canh2 + canh3 > canh1) {
            return "Tam giac thuong";
        } else {
            return "Khong phai tam giac";
        }
    }
}

