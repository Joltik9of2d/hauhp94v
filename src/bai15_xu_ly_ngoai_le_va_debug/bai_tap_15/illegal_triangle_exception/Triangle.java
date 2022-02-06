package bai15_xu_ly_ngoai_le_va_debug.bai_tap_15.illegal_triangle_exception;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextInt();
            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextInt();
            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextInt();
            checkTriangle(a,b,c);
    }
    public static void checkTriangle(double a, double b, double c){
        try{
            if(a<=0||b<=0||c<=0||a+b<=c||a+c<=b||b+c<=a){
                throw new IllegalTriangleException();
            }else {
                System.out.println("3 cạnh hợp lệ");
            }
        }catch (IllegalTriangleException e){
            System.err.println("không phải 3 cạnh của 1 tam giác");
        }
    }

}

