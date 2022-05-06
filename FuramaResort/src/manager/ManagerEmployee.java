package manager;

import models.Customer;
import models.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ManagerEmployee {

    public static String PATH_EMPLOYEE_CSV = "D:\\C0321G1_HuynhPhuocHau_Module2\\FuramaResort\\src\\data\\Employee.csv";

    public static void showEmployee() {
        BufferedReader br = null;
        try{
            String line ;
            br = new BufferedReader(new FileReader(PATH_EMPLOYEE_CSV));
            while ((line=br.readLine())!=null){
                printEmployee(parseCsvLine(line));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    public static void printEmployee(List<String> employee) {
        System.out.println(
                "employee [id= "
                        + employee.get(0)
                        + ", name= " + employee.get(1)
                        + ", birthday =" + employee.get(2)
                        + ", idCard= "+ employee.get(3)
                        + ", phoneNumber= "+ employee.get(4)
                        + ", email= "+ employee.get(5)
                        + ", qualifications= "+ employee.get(6)
                        + ", position= "+ employee.get(7)
                        + ", salary= "+ employee.get(8)
                        + ", workingDepartment= "+ employee.get(9)
                        + "]");
    }
    }
