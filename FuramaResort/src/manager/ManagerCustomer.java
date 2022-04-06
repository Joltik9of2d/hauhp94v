package manager;

import comparator.ComparatorByNamCustomer;
import libs.RegularExpression;
import models.Customer;
import models.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    public void addNewCustomer() {
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
        while (true) {
            System.out.println("Nhập ngày sinh khách hàng (dd/mm/yyy) : ");
            birthday = scanner.nextLine();
            if (RegularExpression.validateBirthday(birthday)) {
                String[] arrayBirthday = birthday.split("/");
                int day = Integer.parseInt(arrayBirthday[0]);
                int month = Integer.parseInt(arrayBirthday[1]);
                int year = Integer.parseInt(arrayBirthday[2]);
                LocalDate birthdayLocalDate = LocalDate.of(year, month, day);
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
                gender = string.toString();
                break;
            }else {
                System.out.println("Giới tính không đúng định dạng, nhập lại.");
            }
        }
        System.out.print("Nhập số CMND: ");
        long identityCardNumber = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        long phoneNumber = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập kiểu khách hàng (Diamond, Platinium, Gold, Silver, Member) : ");
        String customerType = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
//        Customer customer = new Customer(idCustomer, customerName,birthday, gender, identityCardNumber, phoneNumber, email,customerType,address,);
    }
    public void showInformationCustomer(){
        List<Customer> customerList = new ArrayList<>();
        Collections.sort(customerList,new ComparatorByNamCustomer());
        for(Customer customer: customerList){
            System.out.println(customer);
        }
    }
}
