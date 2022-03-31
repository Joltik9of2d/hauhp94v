package view;

import manager.IdExistException;
import manager.ManagerCustomer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IdExistException {
        ManagerCustomer managerCustomer = new ManagerCustomer();
//        managerCustomer.addCustomer();
//        managerCustomer.addCustomer();
//        managerCustomer.addCustomer();
        managerCustomer.displayById();
        managerCustomer.displayByName();
//        managerCustomer.addCustomer();
//        managerCustomer.addCustomer();
//        managerCustomer.addCustomer();
//        managerCustomer.displayByName();
        managerCustomer.editCustomerName();
        managerCustomer.earseCustomerById();
        System.out.print("Nhập tên cần tìm:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        managerCustomer.searchNameCustomer(name);






//        ManagerEmployee managerEmployee = new ManagerEmployee();
//        managerEmployee.addEmployee();
//        ManagerService managerService = new ManagerService();
//        managerService.addService();
}
}
