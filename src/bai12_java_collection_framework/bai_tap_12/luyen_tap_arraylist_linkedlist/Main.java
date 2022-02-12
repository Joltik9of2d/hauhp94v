package bai12_java_collection_framework.bai_tap_12.luyen_tap_arraylist_linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.themsp();
        System.out.println("Chọn chức năng: \n" +
                "1/ Thêm sản phẩm \n" +
                "2/ Sửa tên sản phẩm theo id \n" +
                "3/ Sửa giá sản phẩm theo id \n" +
                "4/ Xóa sản phẩm theo id \n" +
                "5/ Hiển thị danh sách sản phẩm \n" +
                "6/ Tìm kiếm sản phẩm theo tên \n" +
                "7/ Sắp xếp sản phẩm theo giá tăng dần \n" +
                "8/ Sắp xếp sản phẩm theo giá giảm dần \n" +
                "9/ Thoát chương trình.");
        boolean checkLoop = true;
        while (checkLoop) {
            Scanner inputLuaChon = new Scanner(System.in);
            int luaChon = inputLuaChon.nextInt();
            switch (luaChon) {
                case 1:
                  productManager.add();
                  productManager.display();
                  break;
                case 2:
                 productManager.editName();
                 productManager.display();
                 break;
                case 3:
                  productManager.editPrice();
                  productManager.display();
                  break;
                case 4:
                 productManager.earse();
                 productManager.display();
                 break;
                case 5:
                    System.out.println("Hiển thị danh sách sản phẩm:");
                    productManager.display();
                    break;
                case 6:
                    System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
                    Scanner inputNameSearch = new Scanner(System.in);
                    String nameSearch = inputNameSearch.nextLine();
                    System.out.println(productManager.searchName(nameSearch));
                    break;
                case 7:
                    System.out.println("Sắp xếp theo giá sản phẩm tăng dần: ");
                    productManager.sortByPriceIncrease();
                    productManager.display();
                    break;
                case 8:
                    System.out.println("Sắp xếp theo giá sản phẩm giảm dần");
                    productManager.sortByPriceDecrease();
                    productManager.display();
                    break;
                case 9:
                    System.out.println("Thoát chương trình.");
                    checkLoop = false;
                    break;
                default:
                    System.out.println("Nhập lại 1-9");
            }
        }
    }
}