package commons;

import libs.Path;
import models.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class FuncWriteAndRead {

    public static void writeServiceOrCustomerToFile(String path, String service) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(service);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void writeListCustomerToFile(ArrayList<Customer> customerArrayList,String path) {
        BufferedWriter bufferedWriter = null;
        try {
             bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Customer customer : customerArrayList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static ArrayList<Customer> readCustomerListBooking(String path){
        ArrayList<Customer> customerArrayListBooking = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] temp = line.split(",");
                if(temp.length==19) {
                    String[] birthdayArray = temp[2].split("-");
                    LocalDate birthday = LocalDate.of(Integer.parseInt(birthdayArray[0]),
                            Integer.parseInt(birthdayArray[1]), Integer.parseInt(birthdayArray[2]));
                    customerArrayListBooking.add(new Customer(temp[0], temp[1], birthday, temp[3], temp[4],
                            temp[5], temp[6], temp[7], temp[8], new Villa(temp[9],temp[10],temp[11],Double.parseDouble(temp[12]),temp[13],temp[14],
                            temp[15],temp[16],temp[17],Integer.parseInt(temp[18]))));
                }else if(temp.length==18){
                    String[] birthdayArray = temp[2].split("-");
                    LocalDate birthday = LocalDate.of(Integer.parseInt(birthdayArray[0]),
                            Integer.parseInt(birthdayArray[1]), Integer.parseInt(birthdayArray[2]));
                    customerArrayListBooking.add(new Customer(temp[0], temp[1], birthday, temp[3], temp[4],
                            temp[5], temp[6], temp[7], temp[8], new House(temp[9],temp[10],temp[11],Double.parseDouble(temp[12]),temp[13],temp[14],
                            temp[15],temp[16],Integer.parseInt(temp[17]))));
                }else if(temp.length==16){
                    String[] birthdayArray = temp[2].split("-");
                    LocalDate birthday = LocalDate.of(Integer.parseInt(birthdayArray[0]),
                            Integer.parseInt(birthdayArray[1]), Integer.parseInt(birthdayArray[2]));
                    customerArrayListBooking.add(new Customer(temp[0], temp[1], birthday, temp[3], temp[4],
                            temp[5], temp[6], temp[7], temp[8], new Room(temp[9],temp[10],temp[11],Double.parseDouble(temp[12]),temp[13],temp[14],
                            temp[15])));
                }else {
                    System.out.println("lỗi rồi");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return customerArrayListBooking;
    }
    public static ArrayList<Customer> readCustomerList(String path) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                String[] birthdayArray = temp[2].split("-");
                LocalDate birthday = LocalDate.of(Integer.parseInt(birthdayArray[0]),
                        Integer.parseInt(birthdayArray[1]), Integer.parseInt(birthdayArray[2]));
                customerArrayList.add(new Customer(temp[0], temp[1], birthday, temp[3], temp[4],
                        temp[5], temp[6], temp[7], temp[8], null));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerArrayList;

    }

    public static void writeListServiceToFile(ArrayList<Services> servicesArrayList) {
        BufferedWriter bufferedWriter = null;
        try {
             bufferedWriter = new BufferedWriter(new FileWriter(Path.PATH_SERVICES_CSV));
            for (Services services : servicesArrayList) {
                bufferedWriter.write(services.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Services> readServiceList() {
        ArrayList<Services> servicesArrayList = new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader = new BufferedReader(new FileReader(Path.PATH_SERVICES_CSV));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                if (temp.length == 10) {
                    servicesArrayList.add(new Villa(temp[0], temp[1], temp[2], Double.parseDouble(temp[3]), temp[4],
                            temp[5], temp[6], temp[7], temp[8], Integer.parseInt(temp[9])));

                } else if (temp.length == 9) {
                    servicesArrayList.add(new House(temp[0], temp[1], temp[2], Double.parseDouble(temp[3]), temp[4],
                            temp[5], temp[6], temp[7], Integer.parseInt(temp[8])));
                } else {
                    servicesArrayList.add(new Room(temp[0], temp[1], temp[2], Double.parseDouble(temp[3]), temp[4],
                            temp[5], temp[6]));
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return servicesArrayList;
    }

    public static ArrayList<Villa> readVillaList() {
        ArrayList<Villa> villaArrayList = new ArrayList<>();
        for (Services services : FuncWriteAndRead.readServiceList()) {
            if (services instanceof Villa) {
                villaArrayList.add((Villa) services);
            }
        }
        return villaArrayList;
    }

    public static ArrayList<House> readHouseList() {
        ArrayList<House> houseArrayList = new ArrayList<>();
        for (Services services : FuncWriteAndRead.readServiceList()) {
            if (services instanceof House) {
                houseArrayList.add((House) services);
            }
        }
        return houseArrayList;
    }

    public static ArrayList<Room> readRoomList() {
        ArrayList<Room> roomArrayList = new ArrayList<>();
        for (Services services : FuncWriteAndRead.readServiceList()) {
            if (services instanceof Room) {
                roomArrayList.add((Room) services);
            }
        }
        return roomArrayList;
    }
    public static ArrayList<Employee> readEmployeeList(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(Path.PATH_EMPLOYEE_CSV));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                String[] birthdayArray = temp[2].split("-");
                LocalDate birthday = LocalDate.of(Integer.parseInt(birthdayArray[0]),
                        Integer.parseInt(birthdayArray[1]), Integer.parseInt(birthdayArray[2]));
                employeeArrayList.add(new Employee(temp[0],temp[1],birthday,temp[3],temp[4],temp[5],temp[6],temp[7],
                        Double.parseDouble(temp[8]),temp[9]));
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return employeeArrayList;
    }
}