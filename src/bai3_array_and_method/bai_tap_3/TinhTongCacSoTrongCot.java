package bai3_array_and_method.bai_tap_3;

import java.util.Scanner;

public class TinhTongCacSoTrongCot {
    public static void main(String[] args) {
        Scanner inputDong = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int dong = inputDong.nextInt();
        Scanner inputCot = new Scanner(System.in);
        System.out.println("Nhập số cột");
        int cot = inputCot.nextInt();
        int matrix[][] = new int[dong][cot];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Nhập phần tử thứ " + row + " " + column);
                Scanner input = new Scanner(System.in);
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập vị trí cột muốn tính tổng");
        Scanner inputCotTong = new Scanner(System.in);
        int cotTong = inputCotTong.nextInt();
        int sumCot = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == cotTong) {
                    sumCot += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng các số ở cột "+ cotTong+ " là:"+ sumCot);
    }
}
