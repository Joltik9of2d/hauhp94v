package bai11_dsa_stack_queue.bai_tap_11.dao_nguoc_phan_tu_stack;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
//        int[] array = {2,3,4,5};
        System.out.println("Sau khi đảo mảng: "+ MyListStack.reverseArray(array));
        String string = "huynh phuoc hau";
        System.out.println("Sau khi đảo chuỗi: "+ MyListStack.reverseString(string));
    }
}
