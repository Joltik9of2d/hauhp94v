package manager;

import commons.FuncWriteAndRead;
import comparator.ComparatorByNameCustomer;
import exception.*;
import libs.Path;
import libs.RegularExpression;
import models.Customer;
import models.Services;

import java.time.LocalDate;
import java.util.*;

public class ManagerCustomer {
    public static FuncWriteAndRead<Customer> customerFuncWriteAndRead = new FuncWriteAndRead<>();
    public static List<Customer> customerList = customerFuncWriteAndRead.readDataFromFile(Path.PATH_CUSTOMER_CSV);

    public static void addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        String idCustomer = inputIdCustomerToAddService();
        String customerName = inputCustomerName();
        LocalDate birthdayLocalDate = inputBirthday();
        String gender = inputGender();
        String identityCardNumber = inputIdentityCardNumber();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        String email = inputEmail();
        String customerType = inputCustomerType();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Services services = null;
        Customer customer = new Customer(idCustomer, customerName, birthdayLocalDate, gender,
                identityCardNumber, phoneNumber, email, customerType, address, services);
        System.out.println("Thêm khách hàng mới thành công");
        customerList.add(customer);
        FuncWriteAndRead<Customer> funcWriteAndReadCustomer = new FuncWriteAndRead<>();
        funcWriteAndReadCustomer.writeToFile(Path.PATH_CUSTOMER_CSV, customerList);
    }

    private static String inputCustomerType() {
        String customerType = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập kiểu khách hàng (Diamond, Platinium, Gold, Silver, Member) : ");
            customerType = scanner.nextLine();
            if (RegularExpression.validateTypeCustomer(customerType)) {
                break;
            } else {
                System.out.print("Không hợp lệ, nhập lại");
            }
        }
        return customerType;
    }

    private static String inputEmail() {
        String email = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập email : ");
                email = scanner.nextLine();
                if (RegularExpression.validateEmail(email)) {
                    break;
                } else {
                    throw new EmailException("Email không hợp lệ, nhập lại");
                }
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }
        return email;
    }

    private static String inputIdentityCardNumber() {
        String identityCardNumber = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập số CMND (xxx xxx xxx): ");
                identityCardNumber = scanner.nextLine();
                if (RegularExpression.validateIdCard(identityCardNumber)) {
                    break;
                } else {
                    throw new IdCardException("Số CMND không hợp lệ, nhập lại");
                }
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
            }
        }
        return identityCardNumber;
    }

    private static String inputGender() {
        String gender = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập giới tính (Male, Female, Unknow): ");
                gender = scanner.nextLine();
                if (RegularExpression.validateGender(gender)) {
                    gender = RegularExpression.standardizedGender(gender);
                    break;
                } else {
                    throw new GenderException("Gender không hợp lệ, nhập lại");
                }
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }

    private static LocalDate inputBirthday() {
        String birthday = "";
        Scanner scanner = new Scanner(System.in);
        LocalDate birthdayLocalDate;
        while (true) {
            try {
                System.out.print("Nhập ngày sinh khách hàng (dd/mm/yyy) : ");
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
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
        return birthdayLocalDate;
    }

    private static String inputCustomerName() {
        String customerName = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập tên khách hàng (chữ đầu viết hoa):");
                customerName = scanner.nextLine();
                if (RegularExpression.validateNameCustomer(customerName)) {
                    break;
                } else throw new NameException("Tên không hợp lệ");
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }
        return customerName;
    }

    private static String inputIdCustomerToAddService() {
        String idCustomer = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập idCustomer (CU-1234) : ");
            idCustomer = scanner.nextLine();
            if (RegularExpression.validateIdCustomer(idCustomer) && !searchCustomerById(idCustomer)) {
                break;
            } else {
                System.out.println("idCustomer không hợp lệ , nhập lại");
            }
        }
        return idCustomer;
    }

    private static String inputIdCustomerToShow() {
        String idCustomer = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập idCustomer (CU-1234) : ");
            idCustomer = scanner.nextLine();
            if (RegularExpression.validateIdCustomer(idCustomer)) {
                break;
            } else {
                System.out.println("idCustomer không hợp lệ , nhập lại");
            }
        }
        return idCustomer;
    }

    public static void showInformationCustomer() {
        FuncWriteAndRead<Customer> funcWriteAndRead = new FuncWriteAndRead<>();
        System.out.println("Danh sách khách hàng (đã sắp xếp theo tên): ");
        try {
            List<Customer> customerList = funcWriteAndRead.readDataFromFile(Path.PATH_CUSTOMER_CSV);
            Collections.sort(customerList, new ComparatorByNameCustomer());
            for (Customer customer : customerList) {
                System.out.println(customer.showInfor());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean searchCustomerById(String idCustomer) {
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idCustomer)) {
                return true;
            }
        }
        return false;
    }

    public static void searchCustomerByIdToShow() {
        String id = inputIdCustomerToShow();
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(id)) {
                System.out.println("Đã tìm thấy khách hàng " + id);
                System.out.println(customer.showInfor());
                return;
            }
        }
    }

    public static void searchCustomerByNameToShow() {
        String name = inputCustomerName();
        for (Customer customer : customerList) {
            if (customer.getCustomerName().equals(name)) {
                System.out.println("Đã tìm thấy khách hàng " + name);
                System.out.println(customer.showInfor());
            }
        }
    }

    public static void removeCustomer() {
        System.out.print("Nhập id customer cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String idCustomerToRemove = scanner.nextLine();
        while (!searchCustomerById(idCustomerToRemove)) {
            System.out.print("id không tồn tại, nhập lại: ");
            idCustomerToRemove = scanner.nextLine();
        }
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idCustomerToRemove)) {
                customerList.remove(customer);
                System.out.println("Xóa thành công id " + idCustomerToRemove);
                break;
            }
        }
        customerFuncWriteAndRead.writeToFile(Path.PATH_CUSTOMER_CSV, customerList);

    }

    public static void editCustomer() {
        System.out.print("Nhập id customer cần sửa: ");
        Scanner scanner = new Scanner(System.in);
        String idCustomerToEdit = scanner.nextLine();
        while (!searchCustomerById(idCustomerToEdit)) {
            System.out.print("id không tồn tại, nhập lại: ");
            idCustomerToEdit = scanner.nextLine();
        }
        Customer customerToEdit = null;
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idCustomerToEdit)) {
                customerToEdit = customer;
                customerList.remove(customer);
                break;
            }
        }
        boolean check = true;
        int choose = 0;
        while (check) {
            System.out.println("Bạn muốn sửa thông tin : 1.\tSửa tên\n" +
                    "2.\tSửa ngày sinh\n" +
                    "3.\tSửa giới tính\n" +
                    "4.\tSửa số CMND\n" +
                    "5.\tSửa số điện thoại\n" +
                    "6.\tSửa email\n" +
                    "7.\tSửa kiểu khách hàng\n" +
                    "8.\tSửa địa chỉ\n" +
                    "9.\tSửa dịch vụ\n" +
                    "10.\tThoát\n");
            while (true) {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

            switch (choose) {
                case 1:
                    System.out.println("Sửa tên khách hàng");
                    System.out.println("Nhập tên mới");
                    String newName = scanner.nextLine();
                    while (!RegularExpression.validateNameService(newName)) {
                        System.out.println("Tên không đúng định dạng, nhập lại");
                        newName = scanner.nextLine();
                    }
                    customerToEdit.setCustomerName(newName);
                    break;
                case 2:
                    System.out.println("Sửa ngày sinh:");
                    System.out.print("Nhập ngày sinh mới (dd/mm/yyyy): ");
                    String newBirthday = scanner.nextLine();
                    while (!RegularExpression.validateBirthday(newBirthday)) {
                        System.out.println("Ngày sinh không hợp lệ, nhập lại");
                        newBirthday = scanner.nextLine();
                    }
                    customerToEdit.setBirthday(RegularExpression.stringBirthdayToLocadateBirthday(newBirthday));
                    break;
                case 3:
                    System.out.println("Sửa giới tính ");
                    System.out.print("Nhập giới tính mới: ");
                    String newGender = scanner.nextLine();
                    while (!RegularExpression.validateGender(newGender)) {
                        System.out.print("Không đúng định dạng, nhập lại");
                        newGender = scanner.nextLine();
                    }
                    customerToEdit.setGender(RegularExpression.standardizedGender(newGender));
                    break;
                case 4:
                    System.out.println("Sửa số CMND ");
                    System.out.print("Nhập số CMND mới(xxx xxx xxx): ");
                    String newCMND = scanner.nextLine();
                    while (!RegularExpression.validateIdCard(newCMND)) {
                        System.out.print("CMND sai định dạng, nhập lại: ");
                        newCMND = scanner.nextLine();
                    }
                    customerToEdit.setIdentityCardNumber(newCMND);
                    break;
                case 5:
                    System.out.println("Sửa số điện thoại: ");
                    System.out.print("Nhập số điện thoại mới: ");
                    String newPhoneNumber = scanner.nextLine();
                    customerToEdit.setPhoneNumber(newPhoneNumber);
                    break;
                case 6:
                    System.out.println("Sửa email khách hàng: ");
                    System.out.print("Nhập email mới: ");
                    String newEmail = scanner.nextLine();
                    while (!RegularExpression.validateEmail(newEmail)) {
                        System.out.print("Email không đúng định dạng nhập lại: ");
                        newEmail = scanner.nextLine();
                    }
                    customerToEdit.setEmail(newEmail);
                    break;
                case 7:
                    System.out.println("Sửa kiểu khách hàng: ");
                    System.out.print("Nhập kiểu khách hàng mới(Diamond, Platinium, Gold, Silver, Member): ");
                    String newTypeCustomer = scanner.nextLine();
                    while (!RegularExpression.validateTypeCustomer(newTypeCustomer)) {
                        System.out.print("Không đúng định dạng, nhập lại: ");
                        newTypeCustomer = scanner.nextLine();
                    }
                    customerToEdit.setCustomerType(newTypeCustomer);
                    break;
                case 8:
                    System.out.println("Sửa địa chỉ khách hàng");
                    System.out.print("Nhập địa chỉ mới: ");
                    String newAddress = scanner.nextLine();
                    customerToEdit.setAddress(newAddress);
                    break;
                case 9:
                    System.out.println("Sửa dịch vụ: ");
                    ManagerService.showServices();
                    System.out.print("Nhập id service mới: ");
                    String newIdService = scanner.nextLine();
                    while (!ManagerService.searchServiceById(newIdService)) {
                        System.out.println("id không tồn tại, nhập lại: ");
                        newIdService = scanner.nextLine();
                    }
                    Services newService = null;
                    for (Services services : ManagerService.servicesList) {
                        if (services.getId().equals(newIdService)) {
                            newService = services;
                        }
                    }
                    customerToEdit.setServiceOfCustomer(newService);
                    break;
                case 10:
                    System.out.println("Sửa xong, thoát");
                    check = false;
                    break;
                default:
                    System.out.println("Chọn lại");
            }
        }
        System.out.println("Thông tin khách hàng sau khi chỉnh sửa: ");
        System.out.println(customerToEdit.showInfor());
        customerList.add(customerToEdit);
        customerFuncWriteAndRead.writeToFile(Path.PATH_CUSTOMER_CSV, customerList);


    }
}
