package bai12_java_collection_framework.bai_tap_12.luyen_tap_arraylist_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public List<Product> productList = new LinkedList<>();
    Product product1 = new Product(1, "iPhone 12", 20000);
    Product product2 = new Product(2, "iPhone 11", 15000);
    Product product3 = new Product(3, "iPhone 12 pro max", 35000);
    Product product4 = new Product(4, "iPhone 8 plus", 9000);
    Product product5 = new Product(5, "iPhone 7 plus", 5000);
    public void themsp(){
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }
    public void add() {
        Scanner inputAdd = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(inputAdd.nextLine());
        if (searchId(id).equals("Không tìm thấy id " + id)) {
            System.out.print("Nhập tên sản phẩm: ");
            String name = inputAdd.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            int price = Integer.parseInt(inputAdd.nextLine());
            Product product = new Product(id, name, price);
            productList.add(product);
        } else {
            System.out.println("id " + id + " đã tồn tại");
        }
    }
    public void editName() {
        System.out.print("Nhập id cần chỉnh sửa tên: ");
        Scanner inputIdName = new Scanner(System.in);
        int idEditName = inputIdName.nextInt();
        if (searchId(idEditName).equals("Không tìm thấy id " + idEditName)) {
            System.out.println("Không tìm thấy id " + idEditName);
        } else {
            System.out.println("Chỉnh sửa: "+searchId(idEditName));
            System.out.print("Nhập tên mới: ");
            Scanner inputNewName = new Scanner(System.in);
            String nameNew = inputNewName.nextLine();
            for (Product product : productList) {
                if (product.getId() == idEditName) {
                    product.setName(nameNew);
                }
            }
        }

    }
    public void editPrice() {
        System.out.println("Nhập id cần chỉnh sửa giá");
        Scanner inputIdPrice = new Scanner(System.in);
        int idEditPrice = inputIdPrice.nextInt();
        if (searchId(idEditPrice).equals("Không tìm thấy id " + idEditPrice)) {
            System.out.println("Không tìm thấy id " + idEditPrice);

        } else {
            System.out.println("Chỉnh sửa: "+searchId(idEditPrice));
            System.out.print("Nhập giá mới: ");
            int newPrice = inputIdPrice.nextInt();
            for (Product product : productList) {
                if (product.getId() == idEditPrice) {
                    product.setPrice(newPrice);
                }
            }
        }
    }

    public void earse() {
        System.out.print("Nhập id cần xóa: ");
        Scanner inputIdRemove = new Scanner(System.in);
        int idRemove = inputIdRemove.nextInt();
        if (searchId(idRemove).equals("Không tìm thấy id " + idRemove)) {
            System.out.println("Không tìm thấy id " + idRemove);
        } else {
            System.out.println("Bạn có chắc chắn muốn xóa id "+idRemove + ", nhập yes hoặc no");
            Scanner scanner = new Scanner(System.in);
            String sure = scanner.nextLine();
            if(sure.equals("yes")){
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getId() == idRemove) {
                        productList.remove(i);
                    }
                }
                System.out.println("Đã xóa id "+ idRemove);
            }else {
                System.out.println("Chọn lại chức năng khác");
            }

        }
    }

    public void display() {
        for (Product a : productList) {
            System.out.println(a);
        }
    }
    public String searchId(int id) {
        for (Product product : productList) {
            if (product.getId()== id) {
                return product.toString();
            }
        }
        return "Không tìm thấy id "+id;
    }
    public String searchName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return "Đã tìm thấy: " + product.toString();
            }
        }
        return "Không tìm thấy tên "+ name;
    }

    public void sortByPriceIncrease() {
        Collections.sort(productList, new PriceComparatorIncrease());
    }

    public void sortByPriceDecrease() {
        Collections.sort(productList, new PriceComparatorDecrease());
    }


}