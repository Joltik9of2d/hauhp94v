package controller;

import manager.IdExistException;
import manager.ManagerCustomer;
import manager.ManagerEmployee;
import manager.ManagerService;

import java.util.Scanner;

public class Controller {
    public static void menu() throws IdExistException {
        System.out.println("Ứng Dụng Quản Lý Khu nghỉ dưỡng Furama");
        System.out.println("Chọn chức năng của ứng dụng: \n1. Quản lý dịch vụ " +
                "\n2.Quản lý khách hàng \3.Quản lý nhân viên \4.Thoát");
        ManagerService managerService = new ManagerService();
        ManagerCustomer managerCustomer = new ManagerCustomer();
        ManagerEmployee managerEmployee = new ManagerEmployee();
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                managerService.addService();
                break;
            case 2:
        }

    }
    public void menuService(){
        System.out.println("Quản lý dịch vụ");
        System.out.println("Chọn chức năng: \1. Thêm dịch vụ \2.Sửa dịch vụ\n3.Xóa dịch vụ " +
                "\n4.Tìm kiếm dịch vụ qua id\n5.Thoát");
        Scanner scanner = new Scanner(System.in);

    }
}
