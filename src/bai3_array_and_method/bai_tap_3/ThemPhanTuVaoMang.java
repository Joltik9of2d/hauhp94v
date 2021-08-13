package bai3_array_and_method.bai_tap_3;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm");
        int x = input.nextInt();
        Scanner inputIndex = new Scanner(System.in);
        System.out.println("Nhập vị trí muốn chèn");
        int index = inputIndex.nextInt();
        if (index <= 1 || index >= array.length) {
            System.out.println("không chèn được");
        } else {
            for (int i = array.length-1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
        }
        System.out.print("Mảng sau khi thêm: ");
        for (int element : array) {
            System.out.print(element + " ");
        }


    }
}
