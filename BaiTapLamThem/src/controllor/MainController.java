package controllor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import manager.QuanLyKhachHang;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainController {
    public static void menuChinh(){
       while (true){
           System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN\n" +
                   "Chọn chức năng:\n" +
                   "1. Thêm mới khách hàng.\n" +
                   "2. Hiện thị thông tin khách hàng\n" +
                   "3. Tìm kiếm khách hàng\n" +
                   "4. Thêm mới hóa đơn\n" +
                   "5. Chỉnh sửa hóa đơn\n" +
                   "6. Hiện thị thông  tin chi tiết hóa đơn\n" +
                   "7. Thoát\n");
           Scanner scanner = new Scanner(System.in);
           String chon = scanner.nextLine();
           switch (chon){
               case "1":
                   QuanLyKhachHang.themKhachHang();
                   break;
               case "2":
                    QuanLyKhachHang.hienThiThongTinKhachHang();
                    break;
               case "3":
                   QuanLyKhachHang.timKiemKhachHang();
                   break;
               case "4":
               case "5":
               case "6":
               case "7":
                   System.exit(0);
               default:
           }
       }
    }
}
