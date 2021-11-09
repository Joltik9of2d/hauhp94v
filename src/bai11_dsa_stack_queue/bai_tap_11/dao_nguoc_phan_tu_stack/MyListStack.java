package bai11_dsa_stack_queue.bai_tap_11.dao_nguoc_phan_tu_stack;

import java.util.Stack;

public class MyListStack {
    //Đảo ngược mảng
    public static Stack<Integer> reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<Integer>();
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
        //Đảo ngược chuỗi
        Stack<Character> wStack = new Stack<Character>();
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

