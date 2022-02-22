package bai17_io_binary_file_serialization.bai_tap_17.quan_ly_san_pham_ra_file_nhi_phan;

import bai17_io_binary_file_serialization.thuc_hanh_17.read_write_binary.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Serializable {
    List<Product> productList = new ArrayList<>();
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        String manufacture = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập khối lượng (gram): ");
        double weight = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, manufacture, price, weight);
        productList.add(product);
        writeToFile("product.txt",productList);
    }
    public void display(){
        for(Product a : productList){
            System.out.println(a.toString());
        }
    }
    public void searchProduct(){
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(Product a:productList){
            if(a.getNameProduct().equals(name)){
                System.out.println(a.toString());
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }
}
