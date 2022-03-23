package common;

import manager.ManagerService;
import modle.Customer;
import modle.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteRead {
    public static void writeToFile(String path, List<Service> services) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(services);
            oos.writeBytes("\n");
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean searchId(int id){
        List<Service> serviceList = FuncWriteRead.readDataFromFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\service.csv");
        for(Service a: serviceList){
            if(a.getId()==id){
                return true;
            }
        }
        return false;
    }
//    public static boolean searchNameCustomer(String name){
//        List<Customer> customerList  = FuncWriteRead.readDataFromFile("D:\\C0321G1_HuynhPhuocHau_Module2\\src\\CasetudyModule2\\src\\data\\customer.csv");
//        for(Customer a: customerList){
//            if(a.getCustomerName().equals(name)){
//                return true;
//            }
//        }
//        return false;
//    }
    public static List<Service> readDataFromFile(String path){
        List<Service> serviceList = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            serviceList = (List<Service>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return serviceList;
    }
}
