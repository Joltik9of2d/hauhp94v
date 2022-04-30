package controllers;

import manager.*;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        int choose = 0;
     while (true){
         System.out.println("1.\tAdd New Services\n" +
                 "2.\tShow Services\n" +
                 "3.\tAdd New Customer\n" +
                 "4.\tShow Information of Customer ( sort by name) \n" +
                 "5.\tAdd New Booking\n" +
                 "6.\tShow Information of Employee\n" +
                 "7.\tEdit Information of Customer\n"+
                 "8.\tRemove Customer\n"+
                 "9.\tShow Booking\n"+
                 "10.\tSearch employee profile\n"+
                 "11.\tShow all employee\n"+
                 "12.\tShow cinema ticket\n"+
                 "13.\tExit\n");
         try {
             Scanner scanner = new Scanner(System.in);
             choose = Integer.parseInt(scanner.nextLine());
         }catch (NumberFormatException e){
             System.err.println("Nhập sai định dạng, nhập lại: ");
         }

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
                 ManagerBooking.addNewBooking();
                 break;
             case 6:
                 ManagerEmployee.showEmployee();
                 break;
             case 7:
                 ManagerCustomer.editCustomer();
                 break;
             case 8:
                 ManagerCustomer.removeCustomer();
                 break;
             case 9:
                 ManagerBooking.showCustomerBooking();
                 break;
             case 10:
                 TuHoSo.timKiemHoSo();
                 break;
             case 11:
                 ManagerEmployee.showEmployee();
                 break;
             case 12:
                 ManagerService.showCinema4DTicket();
                 break;
             case 13:
                 System.out.println("Thoát");
                 System.exit(0);
         }
     }
    }
}
