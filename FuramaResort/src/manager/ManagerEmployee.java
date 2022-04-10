package manager;

import models.Customer;
import models.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ManagerEmployee {

    public static void addEmployee(){
        Employee employee1 = new Employee("001","Huỳnh Văn An", LocalDate.of(1980,9,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Trung cấp","Lễ Tân",10000.0,"Phục vụ");
        Employee employee2 = new Employee("002","Nguyễn Văn Dũng", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Cao đẳng","Lễ Tân",10000.0,"Phục vụ");
        Employee employee3 = new Employee("003","Huỳnh Văn Kiên", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Cao đẳng","Lễ Tân",10000.0,"Phục vụ");
        Employee employee4 = new Employee("004","Huỳnh Văn Bình", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Đại học ","giám đốc",10000.0,"Quản lý");
        Employee employee5 = new Employee("005","Huỳnh Văn Sơn", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Trung cấp","chuyên viên",10000.0,"Sale – Marketing");
        Employee employee6 = new Employee("006","Huỳnh Thị Hoa", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Trung cấp","chuyên viên",10000.0,"Sale – Marketing");
        Employee employee7 = new Employee("007","Đặng Anh Tuấn", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Đại học ","Lễ Tân",10000.0,"Phục vụ");
        Employee employee8 = new Employee("008","Huỳnh Mỹ", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","Trung cấp","Lễ Tân",10000.0,"Phục vụ");
        Employee employee9 = new Employee("009","Huỳnh Pháp", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","sau đại học","quản lý",10000.0,"Hành Chính");
        Employee employee10 = new Employee("010","Huỳnh Nhật", LocalDate.of(1990,4,5),
                "201691234","84905123456",
                "anhuynh@gmail.com","sau đại học","quản lý",10000.0,"Hành Chính");
        TreeMap<String, Employee> mapEmployee = new TreeMap<>() ;
        mapEmployee.put(employee1.getIdEmployee(),employee1);
        mapEmployee.put(employee2.getIdEmployee(),employee2);
        mapEmployee.put(employee3.getIdEmployee(),employee3);
        mapEmployee.put(employee4.getIdEmployee(),employee4);
        mapEmployee.put(employee5.getIdEmployee(),employee5);
        mapEmployee.put(employee6.getIdEmployee(),employee6);
        mapEmployee.put(employee7.getIdEmployee(),employee7);
        mapEmployee.put(employee8.getIdEmployee(),employee8);
        mapEmployee.put(employee9.getIdEmployee(),employee9);
        mapEmployee.put(employee10.getIdEmployee(),employee10);
        try {
            FileOutputStream fos = new FileOutputStream("D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Employee.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mapEmployee);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Đã ghi 10 nhân viên vào file.");
    }
    public static void showEmployee(){
        try{
            FileInputStream fileInputStream = new FileInputStream("D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Employee.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object treeMap = (TreeMap<Integer,Employee>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Danh sách nhân viên: ");
            for (Object i : ((TreeMap) treeMap).keySet()) {
                System.out.println("key: " + i + " value: " + ((TreeMap) treeMap).get(i));
            }
            } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }        public static ArrayDeque<Customer> veXemPhim;

        public static void muaVeXemPhim(){
            Customer customer1 = new Customer();
            Customer customer2 = new Customer();
            Customer customer3 = new Customer();
            Customer customer4 = new Customer();
            Customer customer5 = new Customer();
            veXemPhim.add(customer1);
            veXemPhim.add(customer2);
            veXemPhim.add(customer3);
            veXemPhim.add(customer4);
            veXemPhim.add(customer5);
            if(veXemPhim.size()==5){
                System.out.println("Danh sách khách hàng: ");
                for (int i=0;i<5;i++){
                    System.out.println(veXemPhim.poll());
                }
            }
        }
    public static void inDanhSachVeXemPhim(){

    }




    }
