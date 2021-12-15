package bai12_java_collection_framework.bai_tap_12.luyen_tap_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManager<T> {
    private List<Product> productList = new LinkedList<>();
    public String add(Product e) {
        productList.add(e);
        return "thêm thành công product: " + e;
    }
    public String edit(int id, String newName, int newPrice) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.get(i).setName(newName);
                productList.get(i).setPrice(newPrice);
                return "Sửa thành công product có id = " + id + " ==> " + productList.get(i).toString();
            }
        }
        return "Không tìm thấy id=" + id;
    }

    public String remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                return "Xóa thành công id " + id;
            }
        }
        return "Không tìm thấy id " + id;
    }

    public void display() {
        for (Product a : productList) {
            System.out.println(a);
        }
    }

    public String search(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName() == name) {
                return "Đã tìm được:"+ productList.get(i).toString();
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
