package manager;

import models.Employee;

import java.time.LocalDate;
import java.util.Stack;

public class TuHoSo {
    public static Stack<Employee> hoSoNhanVien = new Stack<>();
    public static void themHoSo(){
//        Stack<Employee> hoSoNhanVien = null;
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
        hoSoNhanVien.push(employee1);
        hoSoNhanVien.push(employee2);
        hoSoNhanVien.push(employee3);
        hoSoNhanVien.push(employee4);
        hoSoNhanVien.push(employee5);
        hoSoNhanVien.push(employee6);
        hoSoNhanVien.push(employee7);
        hoSoNhanVien.push(employee8);
        hoSoNhanVien.push(employee9);
        hoSoNhanVien.push(employee10);
    }
    public static void timKiemHoSo(String maSoNhanVien){
        boolean check = true;
       while (check){
           if(hoSoNhanVien.peek().getIdEmployee().equals(maSoNhanVien)){
               System.out.println("Đã tìm thấy hồ sơ mã số: "+ maSoNhanVien);
               System.out.println(hoSoNhanVien.peek().toString());
               check = false;
           }else {
               hoSoNhanVien.pop();
           }
           if(hoSoNhanVien.isEmpty()){
               System.out.println("Đã tìm hết mà không có:");
               check = false;
           }
       }
    }
}
