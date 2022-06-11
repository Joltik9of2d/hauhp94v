package manager;

import common.FuncWriteRead;
import models.KhachHang;
import models.KhachHangNuocNgoai;
import models.KhachHangVietNam;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachHang {
    public static Scanner scanner = new Scanner(System.in);
    public static void themKhachHang(){
        System.out.println("Thêm khách hàng mới \n1.Thêm khách hàng Việt Nam\n2.Thêm khách hàng nước ngoài");
        String chon = scanner.nextLine();
        if (chon.equals("1")){
            themKhachHangVietNam();
        }else {
            themKhachHangNuocNgoai();
        }
    }

    public static void themKhachHangVietNam() {
        System.out.println("Nhập mã khách hàng: ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập loại khách hàng");
        String loaiKhachHang = scanner.nextLine();
        System.out.println("Định mức tiêu thụ:");
        double dinhMucTieuThu = Double.parseDouble(scanner.nextLine());
        KhachHangVietNam khachHangVietNam = new KhachHangVietNam(maKhachHang, hoTen,loaiKhachHang,dinhMucTieuThu);
        FuncWriteRead.ghiKhachHangVaoFile(khachHangVietNam.toString());
    }
    public static void themKhachHangNuocNgoai() {
        System.out.println("Nhập mã khách hàng: ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập họ và tên");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập loại quốc tịch");
        String quocTich = scanner.nextLine();
        KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai(maKhachHang,hoTen,quocTich);
        FuncWriteRead.ghiKhachHangVaoFile(khachHangNuocNgoai.toString());
    }
    public static void hienThiThongTinKhachHang(){
        System.out.println("Danh sách khách hàng Việt Nam: ");
        ArrayList<KhachHangVietNam> khachHangVietNamArrayList = FuncWriteRead.docDanhSachKhachHangVietNam();
        for (KhachHangVietNam khachHangVietNam: khachHangVietNamArrayList){
            khachHangVietNam.showInfor();
        }
        System.out.println("Danh sách khách hàng Nước Ngoài: ");
        ArrayList<KhachHangNuocNgoai> khachHangNuocNgoaiArrayList = FuncWriteRead.docDanhSachKhachHangNuocNgoai();
        for (KhachHangNuocNgoai khachHangNuocNgoai: khachHangNuocNgoaiArrayList){
            khachHangNuocNgoai.showInfor();
        }
    }
    public static void timKiemKhachHangBangMaKhachHang(){
        System.out.println("Nhập mã khách hàng:");
        String maKhachHang = scanner.nextLine();
        ArrayList<KhachHang> khachHangArrayList = FuncWriteRead.docDanhSachKhachHang();
        for (KhachHang khachHang: khachHangArrayList){
            if(khachHang.getMaKhachHang().equals(maKhachHang)){
                System.out.println("Đã tìm được khách hàng: ");
                if (khachHang instanceof KhachHangVietNam) {
                    ((KhachHangVietNam) khachHang).showInfor();
                    return;
                }else {
                    ((KhachHangNuocNgoai) khachHang).showInfor();
                    return;
                }
            }
        }
        System.out.println("Không tìm thấy mã khách hàng này");
    }
    public static void timKiemKhachHangBangMaTen(){
        System.out.println("Nhập tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();
        ArrayList<KhachHang> khachHangArrayList = FuncWriteRead.docDanhSachKhachHang();
        for (KhachHang khachHang: khachHangArrayList){
            if(khachHang.getHoTen().equals(tenKhachHang)){
                System.out.println("Đã tìm được khách hàng: ");
                if (khachHang instanceof KhachHangVietNam) {
                    ((KhachHangVietNam) khachHang).showInfor();
                }else {
                    ((KhachHangNuocNgoai) khachHang).showInfor();
                }
            }
        }
    }
    public static void timKiemKhachHang(){
        System.out.println("Tìm bằng\1.Mã khách hàng\n2.Họ tên");
        String chon = scanner.nextLine();
        if (chon.equals("1")){
            timKiemKhachHangBangMaKhachHang();
        }else {
            timKiemKhachHangBangMaTen();
        }
    }
}

