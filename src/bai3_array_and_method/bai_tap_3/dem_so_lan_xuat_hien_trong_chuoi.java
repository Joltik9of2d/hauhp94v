package bai3_array_and_method.bai_tap_3;
import java.util.Scanner;

public class dem_so_lan_xuat_hien_trong_chuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Nhập chuỗi");
        String str = input.nextLine();
        System.out.println("Chuỗi vừa nhập: " + str);
        Scanner inputChar = new Scanner(System.in);
        System.out.println("Nhập vào kí tự: ");
        char myChar= inputChar.next().charAt(0);
        int count = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==myChar){
                count++;
            }
        }
        System.out.println("Ký tự " + myChar+ " xuất hiện "+ count+" lần");

    }
}
