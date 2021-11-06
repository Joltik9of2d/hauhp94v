package bai11_dsa_stack_queue.bai_tap_11.dao_nguoc_phan_tu_stack;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.Stack;

public class MyListStack<E> {
    public static <Char> void main(String[] args) {
        //Đảo ngược mảng
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        for (int i : array) {
            stack.push(i);
        }
        System.out.println("trước khi đảo mảng: " + stack);
        System.out.println("Lấy phần tử ra khỏi mảng");
        for (int i : array) {
            stack.pop();
        }
        System.out.println("Sau khi lấy các phần tử ra: " + stack);
        System.out.println("Thêm các phần tử vào lại");
        for (int i = array.length-1; i >= 0; i--) {
            stack.push(array[i]);
        }
        System.out.println("Sau đảo mảng: " + stack);
        //Đảo ngược chuỗi
        Stack<Character> wStack=new Stack<Character>();
        System.out.println("Nhập vào 1 chuỗi");
        Scanner scanner1 = new Scanner(System.in);
        String string = scanner1.nextLine();
        char[] arr = string.toCharArray();
        for(int i = string.length()-1;i>=0;i--){
            wStack.push(arr[i]);
        }
        String result="";
        for(int i =0;i<string.length();i++){
            result+=wStack.get(i);
        }
        System.out.println("Sau khi đảo chuỗi: "+result);

//        for(int i :wStack){
//            result+= wStack.get(i);
//        }
//        System.out.println(result);
    }
}
