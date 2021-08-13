package bai3_array_and_method.bai_tap_3;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Mảng trước khi xóa: "+ "10,4,6,7,8,6,0,0,0,0");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa");
        int x = input.nextInt();
        for (int i=0;i<array.length;i++){
            if(array[i]==x){
                array[i]=array[i+1];
                for (int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
            }
        }
        System.out.println("Mảng sau khi xóa");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
