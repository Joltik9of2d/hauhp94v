package manager;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import commons.FuncWriteAndRead;
import exception.*;
import libs.RegularExpression;
import models.Customer;
import models.Services;
import models.Villa;

import java.time.LocalDate;
import java.util.*;

public class ManagerCustomer {
    public static final String PATH_BOOKING_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Booking.csv";
    public static final String PATH_CUSTOMER_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Customer.csv";

    public static void addNewCustomer() {
        List<Customer> customerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String idCustomer= "";
        while (true) {
            System.out.print("Nhập idCustomer (CU-1234) : ");
            idCustomer = scanner.nextLine();
            if (RegularExpression.validateIdCustomer(idCustomer)) {
                break;
            } else {
                System.out.println("idCustomer không hợp lệ, nhập lại");
            }
        }
        String customerName = "";
        while (true) {
           try {
               System.out.print("Nhập tên khách hàng (chữ đầu viết hoa):");
               customerName = scanner.nextLine();
               if (RegularExpression.validateNameCustomer(customerName)) {
                   break;
               } else throw new NameException("Tên không hợp lệ");
           }catch (NameException e){
               System.out.println(e.getMessage());
           }
           }
        String birthday="";
        LocalDate birthdayLocalDate;
        while (true) {
          try {
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
                  throw new BirthdayException("Ngày sinh không hợp lệ hoặc chưa đủ 18 tuổi");
              }
          }catch (BirthdayException e){
              System.out.println(e.getMessage());
          }
        }
        String gender="";
        while (true) {
           try {
               System.out.print("Nhập giới tính (Male, Female, Unknow): ");
               gender = scanner.nextLine();
               if (RegularExpression.validateGender(gender)) {
                   gender = gender.toLowerCase();
                   String[] string = gender.split("");
                   string[0] = string[0].toUpperCase();
                   gender = Arrays.toString(string);
                   break;
               } else {
                   throw new GenderException("Gender không hợp lệ, nhập lại");
               }
           }catch (GenderException e){
               System.out.println(e.getMessage());
           }
        }
        String identityCardNumber = "";
        while (true){
           try {
               System.out.print("Nhập số CMND (xxx xxx xxx): ");
               identityCardNumber = scanner.nextLine();
               if(RegularExpression.validateIdCard(identityCardNumber)){
                   break;
               }else {
                   throw new IdCardException("Số CMND không hợp lệ, nhập lại");
               }
           }catch (IdCardException e){
               System.out.println(e.getMessage());
           }
       }
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        String email = "";
        while (true){
       try {
           System.out.print("Nhập email : ");
           email = scanner.nextLine();
           if(RegularExpression.validateEmail(email)){
               break;
           }else {
               throw new EmailException("Email không hợp lệ, nhập lại");
           }
       }catch (EmailException e){
           System.out.println(e.getMessage());
       }
       }
        String customerType = "";
        while (true){
           System.out.print("Nhập kiểu khách hàng (Diamond, Platinium, Gold, Silver, Member) : ");
            customerType = scanner.nextLine();
            if(RegularExpression.validateTypeCustomer(customerType)){
                break;
            }else {
                System.out.println("Không hợp lệ, nhập lại");
            }
       }
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

    public static void showInformationCustomer() {
        FuncWriteAndRead<Customer> funcWriteAndRead = new FuncWriteAndRead<>();
        System.out.println("Danh sách khách hàng: ");
        try {
            List<Customer> customerList = funcWriteAndRead.readDataFromFile(PATH_CUSTOMER_CSV);
            for (Customer customer : customerList) {
                System.out.println(customer.showInfor());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addNewBooking() {
        FuncWriteAndRead<Customer> funcWriteAndReadCustomer = new FuncWriteAndRead<>();
        FuncWriteAndRead<Services> funcWriteAndReadService = new FuncWriteAndRead<>();
        Services servicesToBooking = null;
        Customer customerToBooking = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn khách hàng để booking: ");
        showInformationCustomer();
        System.out.print("Nhập id khách hàng cần booking: ");
        String idCustomerToBooking = scanner.nextLine();
        List<Customer> customerList = funcWriteAndReadCustomer.readDataFromFile(PATH_CUSTOMER_CSV);
        for(Customer customer: customerList){
            if(customer.getIdCustomer().equals(idCustomerToBooking)){
                customerToBooking = customer;
            }
        }

        while (true) {
            System.out.println("Chọn chức năng:\n" +
                    "1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách villa: ");
                    List<Services> servicesListVilla = funcWriteAndReadService.readDataFromFile(ManagerService.PATH_VILLA_CSV);
                    for (Services services : servicesListVilla) {
                        System.out.println(services.showInfor());
                    }
                    System.out.println("Nhập id villa muốn đặt: ");
                    String idVillaBook = scanner.nextLine();
                    for (Services services : servicesListVilla) {
                        if (services.getId().equals(idVillaBook)) {
                            servicesToBooking = services;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sách house: ");
                    List<Services> servicesListHouse = funcWriteAndReadService.readDataFromFile(ManagerService.PATH_HOUSE_CSV);
                    for (Services servicesHouse : servicesListHouse) {
                        System.out.println(servicesHouse.showInfor());
                    }
                    System.out.println("Nhập id house muốn đặt: ");
                    String idHouseBook = scanner.nextLine();
                    for (Services servicesHouse : servicesListHouse) {
                        if (servicesHouse.getId().equals(idHouseBook)) {
                            servicesToBooking = servicesHouse;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sách room: ");
                    List<Services> servicesListRoom = funcWriteAndReadService.readDataFromFile(ManagerService.PATH_ROOM_CSV);
                    for (Services servicesRoom : servicesListRoom) {
                        System.out.println(servicesRoom.showInfor());
                    }
                    System.out.println("Nhập id room muốn đặt: ");
                    String idRoomBook = scanner.nextLine();
                    for (Services servicesRoom : servicesListRoom) {
                        if (servicesRoom.getId().equals(idRoomBook)) {
                            servicesToBooking = servicesRoom;
                        }
                    }
                    break;
                default:
                    System.out.println("Nhập lại");
            }
            customerToBooking.setServiceOfCustomer(servicesToBooking);
            List<Customer> customerListBooking = new ArrayList<>();
            customerListBooking.add(customerToBooking);
            funcWriteAndReadCustomer.writeToFile(PATH_BOOKING_CSV,customerListBooking);
            System.out.println("Booking thành công");
            return;
        }
    }
}
