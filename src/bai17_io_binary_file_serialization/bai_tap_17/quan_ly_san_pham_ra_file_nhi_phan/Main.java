package bai17_io_binary_file_serialization.bai_tap_17.quan_ly_san_pham_ra_file_nhi_phan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        System.out.println("Chọn chức năng: " +
                "\n" + "1. Thêm sản phẩm " +
                "\n2. Hiển thị danh sách sản phẩm" +
                "\n3. Tìm kiếm sản phẩm " +
                "\n4. Thoát chương trình ");
        boolean checkLoop = true;
        while (checkLoop){
        Scanner scanner = new Scanner(System.in);
        int chucNang = scanner.nextInt();
        switch (chucNang) {
            case 1:
                productManager.add();
                productManager.display();
                break;
            case 2:
                productManager.display();
                break;
            case 3:
                productManager.searchProduct();
                break;
            case 4:
                checkLoop =false;
                break;
            default:
                System.out.println("Nhập lại");
        }
        }
    }
}
