package manager;

import commons.FuncWriteAndRead;
import libs.Path;
import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerBooking {
    public static ArrayList<Customer> customerArrayListBooking = FuncWriteAndRead.readCustomerListBooking(Path.PATH_BOOKING_CSV);
    public static ArrayList<Customer> customerArrayList = FuncWriteAndRead.readCustomerList(Path.PATH_CUSTOMER_CSV);


    public static void showCustomerBooking() {
        ArrayList<Customer> customerArrayListBooking = FuncWriteAndRead.readCustomerListBooking(Path.PATH_BOOKING_CSV);
        System.out.println("Danh sách khách hàng và dịch vụ đang sử dụng tại Furama");
        for (Customer customer : customerArrayListBooking) {
            System.out.println("Khách hàng: " + customer.getIdCustomer() + " Tên: " + customer.getCustomerName() + " Đã đặt service " + customer.getServiceOfCustomer().getId());
        }
    }

    public static boolean isServiceBooking(String idService) {
        for (Customer customer : customerArrayListBooking) {
            if (customer.getServiceOfCustomer().getId().equals(idService)) {
                return true;
            }
        }
        return false;
    }

    //    Mỗi dịch vụ chỉ được đặt bới 1 khách hàng, mỗi khách hàng có thể đặt nhiều dịch vụ
    public static void addNewBooking() {
        ManagerCustomer.showInformationCustomer();
        Services servicesToBooking = null;
        Customer customerToBooking = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn khách hàng để booking: ");
        System.out.print("Nhập id khách hàng cần booking: ");
        String idCustomerToBooking = scanner.nextLine();
        while (!ManagerCustomer.isIdCustomerExists(idCustomerToBooking)) {
            System.out.print("id không hợp lệ, nhập lại: ");
            idCustomerToBooking = scanner.nextLine();
        }
        for (Customer customer : customerArrayList) {
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
                    ArrayList<Villa> villaArrayList = FuncWriteAndRead.readVillaList();
                    for (Villa villa : villaArrayList) {
                        System.out.println(villa.showInfor());
                    }
                    String idVillaBook;
                    boolean checkVilla = true;
                    while (checkVilla) {
                        System.out.println("Nhập id villa muốn đặt: ");
                        idVillaBook = scanner.nextLine();
                        while (true) {
                            if (isServiceBooking(idVillaBook)) {
                                System.out.print("Villa này đã có người đặt, vui chọn chọn villa khác: ");
                                idVillaBook = scanner.nextLine();
                            } else {
                                break;
                            }
                        }
                        for (Villa villa : villaArrayList) {
                            if (villa.getId().equals(idVillaBook)) {
                                servicesToBooking = villa;
                                checkVilla = false;
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sách house: ");
                    ArrayList<House> houseArrayList = FuncWriteAndRead.readHouseList();
                    for (House house : houseArrayList) {
                        System.out.println(house.showInfor());
                    }
                    String idHouseBook;
                    boolean checkHouse = true;
                    while (checkHouse) {
                        System.out.println("Nhập id house muốn đặt: ");
                        idHouseBook = scanner.nextLine();
                        while (true) {
                            if (isServiceBooking(idHouseBook)) {
                                System.out.print("House này đã có người đặt, vui lòng chọn house khác: ");
                                idHouseBook = scanner.nextLine();
                            } else {
                                break;
                            }
                        }
                        for (House house : houseArrayList) {
                            if (house.getId().equals(idHouseBook)) {
                                servicesToBooking = house;
                                checkHouse = false;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sách room: ");
                    ArrayList<Room> roomArrayList = FuncWriteAndRead.readRoomList();
                    for (Room room : roomArrayList) {
                        System.out.println(room.showInfor());
                    }
                    String idRoomBook = "";
                    boolean checkRoom = true;
                    while (checkRoom) {
                        System.out.println("Nhập id room muốn đặt: ");
                        idRoomBook = scanner.nextLine();
                        while (true) {
                            if (isServiceBooking(idRoomBook)) {
                                System.out.print("Room này đã có người đặt, vui lòng chọn room khác: ");
                                idRoomBook = scanner.nextLine();
                            } else {
                                break;
                            }
                        }
                        for (Room room : roomArrayList) {
                            if (room.getId().equals(idRoomBook)) {
                                servicesToBooking = room;
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
            customerArrayListBooking.add(customerToBooking);
            FuncWriteAndRead.writeListCustomerToFile(customerArrayListBooking,Path.PATH_BOOKING_CSV);
            System.out.println("Booking thành công");
            return;
        }
    }

}
