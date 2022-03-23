package manager;

import modle.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    List<Customer> customerList = new ArrayList<>();
    public void addCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên khách hàng:");
        String customerName = scanner.nextLine();
        System.out.println("Nhập ngày sinh khách hàng: ");
        System.out.print("Ngày: ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.print("Tháng: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Năm: ");
        int year = Integer.parseInt(scanner.nextLine());
        LocalDate birthday = LocalDate.of(year,month,day);
        System.out.print("Nhập giới tính (nam hoặc nữ) : ");
        String gender = scanner.nextLine();
        System.out.print("Nhập số CMND: ");
        int identityCardNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập kiểu khách hàng (Diamond, Platinium, Gold, Silver, Member) : ");
        String customerType = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, customerName,birthday, gender,identityCardNumber,phoneNumber,email,customerType,address);
        System.out.println(customer.toString());
        customerList.add(customer);
    }
    public void editCustomer(){
        System.out.print("Nhập tên khách hàng cần sửa: ");

    }


}
