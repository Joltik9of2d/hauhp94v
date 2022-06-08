package manager;

import commons.FuncWriteAndRead;
import comparator.ComparatorByNameCustomer;
import exception.*;
import libs.Path;
import libs.ValidateData;
import models.Customer;
import models.Services;

import java.time.LocalDate;
import java.util.*;

public class ManagerCustomer {
    public static ArrayList<Customer> customerArrayList = FuncWriteAndRead.readCustomerList(Path.PATH_CUSTOMER_CSV);

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
        customerArrayList.add(customer);
        FuncWriteAndRead.writeListCustomerToFile(customerArrayList,Path.PATH_CUSTOMER_CSV);
    }

    private static String inputCustomerType() {
        String customerType = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập kiểu khách hàng (Diamond, Platinium, Gold, Silver, Member) : ");
            customerType = scanner.nextLine();
            if (ValidateData.validateTypeCustomer(customerType)) {
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
                if (ValidateData.validateEmail(email)) {
                    break;
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
                if (ValidateData.validateIdCard(identityCardNumber)) {
                    break;
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
                if (ValidateData.validateGender(gender)) {
                    gender = ValidateData.standardizedGender(gender);
                    break;
                }
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        }
        return gender;
    }

    private static LocalDate inputBirthday() {
        Scanner scanner = new Scanner(System.in);
        String birthdayString = "";
        LocalDate birthdayLocalDate;
        while (true) {
            try {
                System.out.print("Nhập ngày sinh khách hàng (dd/mm/yyy) : ");
                birthdayString = scanner.nextLine();
                if (ValidateData.validateBirthday(birthdayString)) {
                    birthdayLocalDate = ValidateData.stringBirthdayToLocadateBirthday(birthdayString);
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
                if (ValidateData.validateNameCustomer(customerName)) {
                    break;
                }
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
            if (ValidateData.validateIdCustomer(idCustomer) && !isIdCustomerExists(idCustomer)) {
                break;
            } else {
                System.out.println("idCustomer không hợp lệ , nhập lại");
            }
        }
        return idCustomer;
    }

    private static String inputIdCustomer() {
        String idCustomer = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập idCustomer (CU-1234) : ");
            idCustomer = scanner.nextLine();
            if (ValidateData.validateIdCustomer(idCustomer)) {
                break;
            } else {
                System.out.println("idCustomer không hợp lệ , nhập lại");
            }
        }
        return idCustomer;
    }

    public static void showInformationCustomer() {
        System.out.println("Danh sách khách hàng (đã sắp xếp theo tên): ");
        try {
            Collections.sort(customerArrayList, new ComparatorByNameCustomer());
            for (Customer customer : customerArrayList) {
                if(customer.getServiceOfCustomer()==null){
                    System.out.println(customer.showInforServiceNull());
                }else {
                    System.out.println(customer.showInfor());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isIdCustomerExists(String idCustomer) {
        for (Customer customer : customerArrayList) {
            if (customer.getIdCustomer().equals(idCustomer)) {
                return true;
            }
        }
        return false;
    }

    public static void searchCustomerByIdToShow() {
        String id = inputIdCustomer();
        for (Customer customer : customerArrayList) {
            if (customer.getIdCustomer().equals(id)) {
                System.out.println("Đã tìm thấy khách hàng " + id);
                System.out.println(customer.showInfor());
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng "+ id);
    }

    public static void searchCustomerByName() {
        String name = inputCustomerName();
        for (Customer customer : customerArrayList) {
            if (customer.getCustomerName().equals(name)) {
                System.out.println("Đã tìm thấy khách hàng " + name);
                System.out.println(customer.showInfor());
            }
        }
        System.out.println("Không tìm thấy tên này");
    }

    public static void removeCustomer() {
        System.out.print("Nhập id customer cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String idCustomerToRemove = scanner.nextLine();
        while (!isIdCustomerExists(idCustomerToRemove)) {
            System.out.print("id không tồn tại, nhập lại: ");
            idCustomerToRemove = scanner.nextLine();
        }
        System.out.print("Bạn có chắc muốn xóa? bấm yes hoặc no: ");
        String isSure = scanner.nextLine();
        if(isSure.equals("no")){
            System.out.println("Không xóa nữa");
            return;
        }
        for (Customer customer : customerArrayList) {
            if (customer.getIdCustomer().equals(idCustomerToRemove)) {
                customerArrayList.remove(customer);
                System.out.println("Xóa thành công id " + idCustomerToRemove);
                break;
            }
        }
        FuncWriteAndRead.writeListCustomerToFile(customerArrayList,Path.PATH_CUSTOMER_CSV);

    }

    public static void editCustomer() {
        System.out.print("Nhập id customer cần sửa: ");
        Scanner scanner = new Scanner(System.in);
        String idCustomerToEdit = scanner.nextLine();
        while (!isIdCustomerExists(idCustomerToEdit)) {
            System.out.print("id không tồn tại, nhập lại: ");
            idCustomerToEdit = scanner.nextLine();
        }
        Customer customerToEdit = null;
        for (Customer customer : customerArrayList) {
            if (customer.getIdCustomer().equals(idCustomerToEdit)) {
                customerToEdit = customer;
                customerArrayList.remove(customer);
                break;
            }
        }
        boolean check = true;
        int choose = 0;
        while (check) {
            System.out.println("Bạn muốn sửa thông tin :\n" +
                    "1.\tSửa tên\n" +
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
                    System.out.println("Sửa tên khách hàng, nhập tên mới");
                    String newName = inputCustomerName();
                    customerToEdit.setCustomerName(newName);
                    break;
                case 2:
                    System.out.println("Sửa ngày sinh, nhập ngày sinh mới");
                    LocalDate newBirthday = inputBirthday();
                    customerToEdit.setBirthday(newBirthday);
                    break;
                case 3:
                    System.out.println("Sửa giới tính, nhập giới tính mới ");
                    String newGender = inputGender();
                    customerToEdit.setGender(newGender);
                    break;
                case 4:
                    System.out.println("Sửa số CMND, nhập số CMND mới ");
                    String newCMND = inputIdentityCardNumber();
                    customerToEdit.setIdentityCardNumber(newCMND);
                    break;
                case 5:
                    System.out.println("Sửa số điện thoại: ");
                    System.out.print("Nhập số điện thoại mới: ");
                    String newPhoneNumber = scanner.nextLine();
                    customerToEdit.setPhoneNumber(newPhoneNumber);
                    break;
                case 6:
                    System.out.println("Sửa email khách hàng, nhập email mới ");
                    String newEmail = inputEmail();
                    customerToEdit.setEmail(newEmail);
                    break;
                case 7:
                    System.out.println("Sửa kiểu khách hàng: ");
                    String newTypeCustomer = inputCustomerType();
                    customerToEdit.setCustomerType(newTypeCustomer);
                    break;
                case 8:
                    System.out.println("Sửa địa chỉ khách hàng");
                    String newAddress = scanner.nextLine();
                    customerToEdit.setAddress(newAddress);
                    break;
                case 9:
                    System.out.println("Sửa dịch vụ: ");
                    ManagerService.showServices();
                    System.out.print("Nhập id service mới: ");
                    String newIdService = scanner.nextLine();
                    while (!ManagerService.isIdServiceExist(newIdService)) {
                        System.out.println("id không tồn tại, nhập lại: ");
                        newIdService = scanner.nextLine();
                    }
                    Services newService = null;
                    for (Services services : ManagerService.servicesArrayList) {
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
        customerArrayList.add(customerToEdit);
        FuncWriteAndRead.writeListCustomerToFile(customerArrayList, Path.PATH_CUSTOMER_CSV);
    }
}
