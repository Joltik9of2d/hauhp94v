package manager;

import common.FuncWriteRead;
import models.HoaDon;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon {
    public static Scanner scanner = new Scanner(System.in);
    public static void themHoaDon(){
        System.out.println("Nhập mã hóa đơn: ");
        String maHoaDon = scanner.nextLine();
        System.out.println("Nhập mã khách hàng: ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập ngày ra hóa đơn dd/mm/yyyy: ");
        String ngayRaHoaDon = scanner.nextLine();
        System.out.println("Nhập số lượng Kw tiêu thụ: ");
        double soLuongKwTieuThu = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập đơn giá: ");
        double donGia = Double.parseDouble(scanner.nextLine());
        HoaDon hoaDon = new HoaDon(maHoaDon, maKhachHang, ngayRaHoaDon, soLuongKwTieuThu,donGia);
        FuncWriteRead.ghiHoaDonVaoFile(hoaDon.toString());
        System.out.println("Thêm hóa đơn thành công");
    }
    public static void hienThiHoaDon(){
        ArrayList<HoaDon> hoaDonArrayList = FuncWriteRead.docHoaDon();
        for (HoaDon hoaDon: hoaDonArrayList){
            hoaDon.showInfor();
        }
    }
}
