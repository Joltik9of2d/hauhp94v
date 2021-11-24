package bai11_dsa_stack_queue.bai_tap_11.dao_nguoc_phan_tu_stack;

import java.util.Scanner;
import java.util.Stack;

public class MyListStack {
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
    public static Stack<Integer> reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i : array) {
            stack.push(i);
        }
        for (int i : array) {
            stack.pop();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            stack.push(array[i]);
        }
        return stack;
    }
    public static String reverseString(String string) {
        Stack<Character> wStack = new Stack<>();
        char[] arr = string.toCharArray();
        for (int i = string.length() - 1; i >= 0; i--) {
            wStack.push(arr[i]);
        }
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result += wStack.get(i);
        }
        return result;
    }
}

