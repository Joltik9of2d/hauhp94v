package bai15_xu_ly_ngoai_le_va_debug.bai_tap_15.illegal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void validate(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Không phải tam giác");
        } else {
            System.out.println("Là 1 tam giác");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập cạnh a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh c: ");
                double c = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);
                validate(a, b, c);
                System.out.println(triangle.toString());
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e + " Nhập lại!");
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại kí tự số");
            } catch (Exception e) {
                System.out.println("Lỗi rồi, nhập lại");
            } finally {
                System.out.println("finally");
            }
        }


    }


}

