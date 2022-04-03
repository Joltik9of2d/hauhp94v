package manager;

import common.FuncWriteRead;
import comparator.ComparatorByIdCustomer;
import comparator.ComparatorByNameCustomer;
import modle.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    public static final String PATH_CUSTOMER_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\CasetudyModule2\\src\\data\\customer.csv";
    List<Customer> customerList = new ArrayList<>();
    public void addCustomer() throws IdExistException {
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
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
        long identityCardNumber = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập số điện thoại: ");
        long phoneNumber = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập kiểu khách hàng (Diamond, Platinium, Gold, Silver, Member) : ");
        String customerType = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, customerName,birthday, gender,identityCardNumber,phoneNumber,email,customerType,address);
        System.out.println(customer.toString());
        customerList.add(customer);
        funcWriteRead.writeToFile(PATH_CUSTOMER_CSV, customerList);
    }
    public void editCustomerName(){
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
        customerList = funcWriteRead.readDataFromFile(PATH_CUSTOMER_CSV);
        System.out.print("Nhập id khách hàng cần sửa: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        if(searchIdCustomer(id)){
            System.out.print("Nhập tên mới cho id "+id+": ");
            String newName = scanner.nextLine();
            for (Customer customer: customerList){
                if(customer.getIdCustomer()==id){
                    customer.setCustomerName(newName);
                    System.out.println("Đã đổi tên");
                    System.out.println(customer.toString());
                }
            }
        }
        funcWriteRead.writeToFile(PATH_CUSTOMER_CSV, customerList);
    }
    public void earseCustomerById(){
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
        customerList = funcWriteRead.readDataFromFile(PATH_CUSTOMER_CSV);
        System.out.print("Nhập id khách hàng cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        if(searchIdCustomer(id)){
            System.out.print("Bạn có chắc chắn muốn xóa? yes or no: ");
            String choose = scanner.nextLine();
            if(choose.equals("yes")){
                for(int i=0;i<customerList.size();i++){
                    if(customerList.get(i).getIdCustomer()==id){
                        customerList.remove(i);
                        System.out.println("Đã xóa id "+id);
                    }
                }
            }else {
                System.out.println("Không xóa!");
            }

        }else {
            System.out.println("Không tìm thấy tên này. ");
        }
        funcWriteRead.writeToFile(PATH_CUSTOMER_CSV, customerList);
    }
    public boolean searchNameCustomer(String name){
        List<Customer> customerList = new ArrayList<>();
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
        customerList = funcWriteRead.readDataFromFile(PATH_CUSTOMER_CSV);
        for(Customer customer: customerList){
            if(customer.getCustomerName().equals(name)){
                System.out.println(customer);
                return true;
            }
        }
        System.out.println("Không tìm thấy");
        return false;
    }
    public void searchNameCustomerToDisplay(String name){
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
        customerList = funcWriteRead.readDataFromFile(PATH_CUSTOMER_CSV);
        for(Customer customer: customerList){
            if(customer.getCustomerName().equals(name)){
                System.out.println(customer);
            }
        }
    }
    public static boolean searchIdCustomer(int id){
        List<Customer> customerList = new ArrayList<>();
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
        customerList = funcWriteRead.readDataFromFile(PATH_CUSTOMER_CSV);
        for(Customer customer: customerList){
            if(customer.getIdCustomer()==id){
                System.out.println(customer);
                return true;
            }
        }
        System.out.println("Không tìm thấy");
        return false;
    }
    public void displayById(){
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
        System.out.println("Hiển thị danh sách khách hàng (sắp xếp theo id): ");
        customerList = funcWriteRead.readDataFromFile(PATH_CUSTOMER_CSV);
        Collections.sort(customerList,new ComparatorByIdCustomer());
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }
    public void displayByName(){
        FuncWriteRead<Customer> funcWriteRead = new FuncWriteRead<>();
        System.out.println("Hiển thị danh sách khách hàng (sắp xếp theo tên): ");
        customerList = funcWriteRead.readDataFromFile(PATH_CUSTOMER_CSV);
        Collections.sort(customerList,new ComparatorByNameCustomer());
        for (Customer customer : customerList){
            System.out.println(customer);
        }
    }
}
