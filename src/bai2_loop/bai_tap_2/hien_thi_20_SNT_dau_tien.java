package bai2_loop.bai_tap_2;

import java.util.Scanner;

public class hien_thi_20_SNT_dau_tien {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to");
        number = input.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            if (CheckPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }

    static boolean CheckPrime(int number) {
        if (number < 2) {
            return false;
        }
        int count = 0;
        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}

