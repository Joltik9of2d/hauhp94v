package bai12_java_collection_framework.bai_tap_12.luyen_tap_arraylist_linkedlist;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "iPhone 12", 20000);
        Product product2 = new Product(2, "iPhone 11", 15000);
        Product product3 = new Product(3, "iPhone 12 pro max", 35000);
        Product product4 = new Product(4, "iPhone 8 plus", 9000);
        Product product5 = new Product(5, "iPhone 7 plus", 5000);
        ProductManager productManager = new ProductManager();
        System.out.println(productManager.add(product));
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.add(product5);
        productManager.display();
        System.out.println("Xóa product có id = 3:");
        System.out.println(productManager.remove(3));
        productManager.display();
        System.out.println("Sửa product có id=1");
        String x = productManager.edit(1,"iPhone 13", 30000);
        System.out.println(x);
        productManager.display();
        System.out.println("Sắp xếp theo giá tăng: ");
        productManager.sortByPriceIncrease();
        productManager.display();
        productManager.sortByPriceDecrease();
        System.out.println("Sắp xếp theo giá giảm: ");
        productManager.display();
        System.out.println("Tìm tên iPhone 7 plus: ");
        System.out.println(productManager.search("iPhone 7 plus"));
    }
}
