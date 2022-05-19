package manager;

import libs.Path;
import models.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TuHoSo {
    public static void timKiemHoSo() {
        Stack<List> stack = new Stack<>();
        System.out.println("Nhập số nhân viên(001-010): ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        BufferedReader br;
        try {
            String line;
            br = new BufferedReader(new FileReader(Path.PATH_EMPLOYEE_CSV));
            while ((line = br.readLine()) != null) {
                    stack.push(ManagerEmployee.parseCsvLine(line));
            }
            while (!stack.isEmpty()){
                if(stack.peek().get(0).equals(id)){
                    System.out.println("đã tìm thấy: ");
                    ManagerEmployee.printEmployee(stack.pop());
                    break;
                }else {
                    stack.pop();
                }
                if(stack.isEmpty()){
                    System.out.println("Không tìm thấy id này");
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
