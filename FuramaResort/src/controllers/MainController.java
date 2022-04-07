package controllers;

import manager.ManagerCustomer;
import manager.ManagerEmployee;
import manager.ManagerService;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
     while (true){
         System.out.println("1.\tAdd New Services\n" +
                 "2.\tShow Services\n" +
                 "3.\tAdd New Customer\n" +
                 "4.\tShow Information of Customer\n" +
                 "5.\tAdd New Booking\n" +
                 "6.\tShow Information of Employee\n" +
                 "7.\tExit\n");
         Scanner scanner = new Scanner(System.in);
         int choose = Integer.parseInt(scanner.nextLine());
         switch (choose){
             case 1:
                 ManagerService.addNewServies();
                 break;
             case 2:
                 ManagerService.showServices();
                 break;
             case 3:
                 ManagerCustomer.addNewCustomer();
                 break;
             case 4:
                 ManagerCustomer.showInformationCustomer();
                 break;
             case 5:
                 ManagerCustomer.addNewBooking();
                 break;
             case 6:
                 ManagerEmployee.showEmployee();
                 break;
             case 7:
                 System.out.println("Thoát");
                 System.exit(0);
         }
     }
    }
}
