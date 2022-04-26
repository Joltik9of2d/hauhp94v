package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteAndRead<T> {
    public void writeToFile(String path, List<T> t) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
//            oos.writeBytes("\n");
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public List<T> readDataFromFile(String path){
        List<T> tList = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            tList = (List<T>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            System.err.println("File đang rỗng hoặc có lỗi");
            e.printStackTrace();
        }
        return tList;
    }
}
