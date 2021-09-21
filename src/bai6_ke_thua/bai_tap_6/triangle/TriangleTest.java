package bai6_ke_thua.bai_tap_6.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        double a,b,c;
        String d;
        System.out.println("Nhập màu sắc: ");
        Scanner color = new Scanner(System.in);
        d = color.nextLine();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào các cạnh của tam giác");
            System.out.println("Nhập cạnh a: ");
            a = scanner.nextDouble();
            System.out.println("Nhập cạnh b: ");
            b = scanner.nextDouble();
            System.out.println("Nhập cạnh c: ");
            c = scanner.nextDouble();
        }
        while (a + b <= c || a + c <= b || b + c <= a);
        Triangle triangle2 = new Triangle(d, a, b, c);
        System.out.println(triangle2);
    }
}
