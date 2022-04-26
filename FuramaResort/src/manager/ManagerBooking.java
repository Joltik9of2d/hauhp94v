package manager;

import commons.FuncWriteAndRead;
import models.Customer;
import models.Services;

import java.util.List;
import java.util.Scanner;

public class ManagerBooking {
    public static FuncWriteAndRead<Customer> customerFuncWriteAndReadToBooking = new FuncWriteAndRead<>();
    public static List<Customer> listBooking = customerFuncWriteAndReadToBooking.readDataFromFile(ManagerCustomer.PATH_BOOKING_CSV);
    public static FuncWriteAndRead<Customer> funcWriteAndRead = new FuncWriteAndRead<>();
    public static List<Customer> customerList = funcWriteAndRead.readDataFromFile(ManagerCustomer.PATH_CUSTOMER_CSV);

    public static void showCustomerBooking() {
        for (Customer customer : listBooking){
            System.out.println(customer.showInfor()+"\n Đã đặt "+customer.getServiceOfCustomer().showInfor());
        }
    }
    public static void addNewBooking() {
        ManagerCustomer.showInformationCustomer();
        FuncWriteAndRead<Customer> funcWriteAndReadCustomer = new FuncWriteAndRead<>();
        FuncWriteAndRead<Services> funcWriteAndReadService = new FuncWriteAndRead<>();
        Services servicesToBooking = null;
        Customer customerToBooking = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn khách hàng để booking: ");
        System.out.print("Nhập id khách hàng cần booking: ");
        String idCustomerToBooking = scanner.nextLine();
        while (!ManagerCustomer.searchCustomerById(idCustomerToBooking)) {
            System.out.print("id không hợp lệ, nhập lại: ");
            idCustomerToBooking = scanner.nextLine();
        }
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idCustomerToBooking)) {
                customerToBooking = customer;
            }
        }

        while (true) {
            int choose = 0;
            while (true) {
                try {
                    System.out.println("Chọn chức năng:\n" +
                            "1.\tBooking Villa\n" +
                            "2.\tBooking House\n" +
                            "3.\tBooking Room\n");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            switch (choose) {
                case 1:
                    System.out.println("Danh sách villa: ");
                    List<Services> servicesListVilla = funcWriteAndReadService.readDataFromFile(ManagerService.PATH_VILLA_CSV);
                    for (Services services : servicesListVilla) {
                        System.out.println(services.showInfor());
                    }
                    String idVillaBook = "";
                    boolean checkVilla = true;
                    while (checkVilla) {
                        System.out.println("Nhập id villa muốn đặt: ");
                        idVillaBook = scanner.nextLine();
                        for (Services services : servicesListVilla) {
                            if (services.getId().equals(idVillaBook)) {
                                servicesToBooking = services;
                                checkVilla = false;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sách house: ");
                    List<Services> servicesListHouse = funcWriteAndReadService.readDataFromFile(ManagerService.PATH_HOUSE_CSV);
                    for (Services servicesHouse : servicesListHouse) {
                        System.out.println(servicesHouse.showInfor());
                    }
                    String idHouseBook = "";
                    boolean checkHouse = true;
                    while (checkHouse) {
                        System.out.println("Nhập id house muốn đặt: ");
                        idHouseBook = scanner.nextLine();
                        for (Services servicesHouse : servicesListHouse) {
                            if (servicesHouse.getId().equals(idHouseBook)) {
                                servicesToBooking = servicesHouse;
                                checkHouse = false;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sách room: ");
                    List<Services> servicesListRoom = funcWriteAndReadService.readDataFromFile(ManagerService.PATH_ROOM_CSV);
                    for (Services servicesRoom : servicesListRoom) {
                        System.out.println(servicesRoom.showInfor());
                    }
                    String idRoomBook = "";
                    boolean checkRoom = true;
                    while (checkRoom) {
                        System.out.println("Nhập id room muốn đặt: ");
                        idRoomBook = scanner.nextLine();
                        for (Services servicesRoom : servicesListRoom) {
                            if (servicesRoom.getId().equals(idRoomBook)) {
                                servicesToBooking = servicesRoom;
                                checkRoom = false;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Nhập lại");
            }
            customerToBooking.setServiceOfCustomer(servicesToBooking);
            listBooking.add(customerToBooking);
            customerFuncWriteAndReadToBooking.writeToFile(ManagerCustomer.PATH_BOOKING_CSV, listBooking);
            System.out.println("Booking thành công");
            return;
        }
    }

}
