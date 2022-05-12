package controllers;

import manager.*;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        int choose = 0;
     while (true){
         System.out.println("------------FURAMA-RESORT------------\n" +
                 "1.\tAdd New Services\n" +
                 "2.\tShow Services\n" +
                 "3.\tAdd New Customer\n" +
                 "4.\tShow Information of Customer ( sort by name) \n" +
                 "5.\tAdd New Booking\n" +
                 "6.\tShow Information of Employee\n" +
                 "7.\tEdit Information of Customer\n"+
                 "8.\tRemove Customer\n"+
                 "9.\tRemove Service\n"+
                 "10.\tShow Booking\n"+
                 "11.\tSearch employee profile\n"+
                 "12.\tShow all employee\n"+
                 "13.\tBuy cinema ticket\n"+
                 "14.\tShow cinema ticket\n"+
                 "15.\tSearch customer by id\n"+
                 "16.\tSearch customer by name\n"+
                 "17.\tExit\n");
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
                 ManagerService.removeServiceById();
                 break;
             case 10:
                 ManagerBooking.showCustomerBooking();
                 break;
             case 11:
                 TuHoSo.timKiemHoSo();
                 break;
             case 12:
                 ManagerEmployee.showEmployee();
                 break;
             case 13:
                 ManagerTicketCinema.buyTicketCinema();
                 break;
             case 14:
                 ManagerTicketCinema.showTicketCinema();
                 break;
             case 15:
                 ManagerCustomer.searchCustomerByIdToShow();
                 break;
             case 16:
                 ManagerCustomer.searchCustomerByNameToShow();
                 break;
             case 17:
                 System.out.println("Thoát");
                 System.exit(0);
             default:
                 System.out.println("Chỉ được chọn 1-15");
         }
     }
    }
}
