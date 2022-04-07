package manager;

import commons.FuncWriteAndRead;
import comparator.ComparatorByNameCustomer;
import libs.RegularExpression;
import models.Customer;
import models.Services;

import java.time.LocalDate;
import java.util.*;

public class ManagerCustomer {
    public static final String PATH_CUSTOMER_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Customer.csv";

    public static void addNewCustomer() {
        List<Customer> customerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String idCustomer;
        while (true) {
            System.out.print("Nhập idCustomer (CU-1234) : ");
            idCustomer = scanner.nextLine();
            if (RegularExpression.validateIdCustomer(idCustomer)) {
                break;
            } else {
                System.out.println("idCustomer không hợp lệ, nhập lại");
            }
        }
        System.out.print("Nhập tên khách hàng:");
        String customerName = scanner.nextLine();
        String birthday;
        LocalDate birthdayLocalDate;
        while (true) {
            System.out.println("Nhập ngày sinh khách hàng (dd/mm/yyy) : ");
            birthday = scanner.nextLine();
            if (RegularExpression.validateBirthday(birthday)) {
                String[] arrayBirthday = birthday.split("/");
                int day = Integer.parseInt(arrayBirthday[0]);
                int month = Integer.parseInt(arrayBirthday[1]);
                int year = Integer.parseInt(arrayBirthday[2]);
                birthdayLocalDate = LocalDate.of(year, month, day);
                break;
            } else {
                System.out.println("Birthday không hợp lệ hoặc chưa đủ 18 tuổi, nhập lại");
            }
        }
        String gender;
        while (true) {
            System.out.print("Nhập giới tính (Male, Female, Unknow): ");
            gender = scanner.nextLine();
            if (RegularExpression.validateGender(gender)) {
                gender = gender.toLowerCase();
                String[] string = gender.split("");
                string[0] = string[0].toUpperCase();
                gender = Arrays.toString(string);
                break;
            } else {
                System.out.println("Giới tính không đúng định dạng, nhập lại.");
            }
        }
        System.out.print("Nhập số CMND: ");
        String identityCardNumber = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập kiểu khách hàng (Diamond, Platinium, Gold, Silver, Member) : ");
        String customerType = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Mời bạn đặt dịch vụ: ");
        Services services = null;
        Customer customer = new Customer(idCustomer, customerName, birthdayLocalDate, gender,
                identityCardNumber, phoneNumber, email, customerType, address, services);
        customerList.add(customer);
        FuncWriteAndRead<Customer> funcWriteAndReadCustomer = new FuncWriteAndRead<>();
        funcWriteAndReadCustomer.writeToFile(PATH_CUSTOMER_CSV, customerList);
    }

    public static <Customer> void showInformationCustomer() {
        FuncWriteAndRead<Services> funcWriteAndRead = new FuncWriteAndRead<>();
        List<Customer> customerList = (List<Customer>) funcWriteAndRead.readDataFromFile(PATH_CUSTOMER_CSV);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static Services addNewBooking() {
        List<Customer> customerList = new ArrayList<>();
        FuncWriteAndRead funcWriteAndRead = new FuncWriteAndRead();
        while (true){
            System.out.println("Chọn chức năng:\n" +
                    "1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách villa: ");
                    List<Services> servicesListVilla = funcWriteAndRead.readDataFromFile(ManagerService.PATH_VILLA_CSV);
                    for (Services services : servicesListVilla) {
                        System.out.println(services);
                    }
                    System.out.println("Nhập id villa muốn đặt: ");
                    String idVillaBook = scanner.nextLine();
                    int index = 0;
                    for (Services services : servicesListVilla) {
                        if (services.getId().equals(idVillaBook)) {
                            index = servicesListVilla.indexOf(services);
                        }
                    }
                    return servicesListVilla.get(index);
                case 2:
                    System.out.println("Danh sách house: ");
                    List<Services> servicesListHouse = funcWriteAndRead.readDataFromFile(ManagerService.PATH_HOUSE_CSV);
                    for (Services servicesHouse : servicesListHouse) {
                        System.out.println(servicesHouse);
                    }
                    System.out.println("Nhập id house muốn đặt: ");
                    String idHouseBook = scanner.nextLine();
                    int indexHouse = 0;
                    for (Services servicesHouse : servicesListHouse) {
                        if (servicesHouse.getId().equals(idHouseBook)) {
                            indexHouse = servicesListHouse.indexOf(servicesHouse);
                        }
                    }
                    return servicesListHouse.get(indexHouse);
                case 3:
                    System.out.println("Danh sách room: ");
                    List<Services> servicesListRoom = funcWriteAndRead.readDataFromFile(ManagerService.PATH_ROOM_CSV);
                    for (Services servicesRoom : servicesListRoom) {
                        System.out.println(servicesRoom);
                    }
                    System.out.println("Nhập id room muốn đặt: ");
                    String idRoomBook = scanner.nextLine();
                    int indexRoom = 0;
                    for (Services servicesRoom : servicesListRoom) {
                        if (servicesRoom.getId().equals(idRoomBook)) {
                            indexRoom = servicesListRoom.indexOf(servicesRoom);
                        }
                    }
                    return servicesListRoom.get(indexRoom);
                default:
                    System.out.println("Nhập lại");
            }
        }
    }
}
