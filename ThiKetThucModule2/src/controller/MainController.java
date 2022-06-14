package controller;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        String chon = null;
        while (true){
            System.out.println("------------------------------------FURAMA-RESORT------------------------------------\n" +
                    "1.\tAdd New Services\t\t\t\t" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\t\t\t\t" +
                    "4.\tShow Information of Customer ( sort by name) \n" +
                    "5.\tAdd New Booking\t\t\t\t\t" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tEdit Information of Customer\t"+
                    "8.\tRemove Customer\n"+
                    "9.\tRemove Service\t\t\t\t\t"+
                    "10.\tShow Booking\n"+
                    "11.\tSearch employee profile\t\t\t"+
                    "12.\tShow all employee\n"+
                    "13.\tBuy cinema ticket\t\t\t\t"+
                    "14.\tShow cinema ticket\n"+
                    "15.\tSearch customer by id\t\t\t"+
                    "16.\tSearch customer by name\n"+
                    "17.\tSearch service by id\t\t\t"+
                    "18.\tSearch service by name\n"+
                    "19.\tExit\t");
                Scanner scanner = new Scanner(System.in);
                chon = scanner.nextLine();
            switch (chon){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    System.out.println("Thoát");
                    System.exit(0);
                default:
                    System.out.println("Chỉ được chọn 1-7");
            }
        }
    }
}
