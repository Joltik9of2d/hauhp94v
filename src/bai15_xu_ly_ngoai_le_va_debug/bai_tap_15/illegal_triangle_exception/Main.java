package bai15_xu_ly_ngoai_le_va_debug.bai_tap_15.illegal_triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextInt();
            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextInt();
            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextInt();
           try{
                   Triangle triangle = new Triangle(a,b,c);
                   System.out.println(triangle.toString());
           } catch (IllegalTriangleException e) {
                   e.message();
           }
    }



}

