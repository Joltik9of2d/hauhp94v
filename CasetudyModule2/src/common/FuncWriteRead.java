package common;

import modle.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteRead<T> {
    private T t;
    public void writeToFile(String path, List<T> t) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.writeBytes("\n");
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static boolean searchIdService(int id){
        FuncWriteRead funcWriteRead = new FuncWriteRead();
        List<Service> serviceList = funcWriteRead.readDataFromFile("D:\\C0321G1_HuynhPhuocHau_Module2\\CasetudyModule2\\src\\data\\service.csv");
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
    public List<T> readDataFromFile(String path){
        List<T> tList = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            tList = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return tList;
    }
}
