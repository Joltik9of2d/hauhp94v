package bai15_xu_ly_ngoai_le_va_debug.bai_tap_15.illegal_triangle_exception;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(double side1, double side2, double side3) {
    }
    public void message(){
        System.err.println("không phải 3 cạnh của tam giác");
    }
}
