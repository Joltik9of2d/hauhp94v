package manager;

import commons.FuncWriteAndRead;
import libs.Path;
import models.Customer;
import models.Services;

import java.util.List;
import java.util.Scanner;

public class ManagerBooking {
    public static FuncWriteAndRead<Customer> funcWriteAndRead = new FuncWriteAndRead<>();
    public static List<Customer> listBooking = funcWriteAndRead.readDataFromFile(Path.PATH_BOOKING_CSV);
    public static List<Customer> customerList = funcWriteAndRead.readDataFromFile(Path.PATH_CUSTOMER_CSV);

    public static void showCustomerBooking() {
        System.out.println("Danh sách khách hàng và dịch vụ đang sử dụng tại Furama");
        for (Customer customer : listBooking) {
            System.out.println("Khách hàng: " + customer.getIdCustomer() + " Tên: " + customer.getCustomerName() + " Đã đặt service " + customer.getServiceOfCustomer().getId());
        }
    }

    public static boolean searchServiceBooking(String idService) {
        for (Customer customer : listBooking) {
            if (customer.getServiceOfCustomer().getId().equals(idService)) {
                return true;
            }
        }
        return false;
    }

    //    Mỗi dịch vụ chỉ được đặt bới 1 khách hàng, mỗi khách hàng có thể đặt nhiều dịch vụ
    public static void addNewBooking() {
        ManagerCustomer.showInformationCustomer();
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
            int choose;
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
                    List<Services> servicesListVilla = funcWriteAndReadService.readDataFromFile(Path.PATH_VILLA_CSV);
                    for (Services services : servicesListVilla) {
                        System.out.println(services.showInfor());
                    }
                    String idVillaBook;
                    boolean checkVilla = true;
                    while (checkVilla) {
                        System.out.println("Nhập id villa muốn đặt: ");
                        idVillaBook = scanner.nextLine();
                        while (true) {
                            if (searchServiceBooking(idVillaBook)) {
                                System.out.print("Villa này đã có người đặt, vui chọn chọn villa khác: ");
                                idVillaBook = scanner.nextLine();
                            } else {
                                break;
                            }
                        }
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
                    List<Services> servicesListHouse = funcWriteAndReadService.readDataFromFile(Path.PATH_HOUSE_CSV);
                    for (Services servicesHouse : servicesListHouse) {
                        System.out.println(servicesHouse.showInfor());
                    }
                    String idHouseBook;
                    boolean checkHouse = true;
                    while (checkHouse) {
                        System.out.println("Nhập id house muốn đặt: ");
                        idHouseBook = scanner.nextLine();
                        while (true) {
                            if (searchServiceBooking(idHouseBook)) {
                                System.out.print("House này đã có người đặt, vui lòng chọn house khác: ");
                                idHouseBook = scanner.nextLine();
                            } else {
                                break;
                            }
                        }
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
                    List<Services> servicesListRoom = funcWriteAndReadService.readDataFromFile(Path.PATH_ROOM_CSV);
                    for (Services servicesRoom : servicesListRoom) {
                        System.out.println(servicesRoom.showInfor());
                    }
                    String idRoomBook = "";
                    boolean checkRoom = true;
                    while (checkRoom) {
                        System.out.println("Nhập id room muốn đặt: ");
                        idRoomBook = scanner.nextLine();
                        while (true) {
                            if (searchServiceBooking(idRoomBook)) {
                                System.out.print("Room này đã có người đặt, vui lòng chọn room khác: ");
                                idRoomBook = scanner.nextLine();
                            } else {
                                break;
                            }
                        }
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
            funcWriteAndRead.writeToFile(Path.PATH_BOOKING_CSV, listBooking);
            System.out.println("Booking thành công");
            return;
        }
    }

}
