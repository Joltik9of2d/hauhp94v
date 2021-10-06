package bai8_clean_code_and_refactoring.thuc_hanh_8.refactoring_doi_ten_bien_va_tach_hang;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập firstOperand:");
        int firstOperand = scanner.nextInt();
        System.out.println("Nhập secondOperand:");
        int secondOperand = scanner.nextInt();
        System.out.println("Nhập operator:");
        Scanner scanner1 = new Scanner(System.in);
        char operator = scanner1.next().charAt(0);
        System.out.println(Calculator.calculate(firstOperand,secondOperand,operator));
    }
}
