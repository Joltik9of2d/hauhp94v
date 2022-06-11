package models;

import common.FuncWriteRead;
import libs.Validate;

public class HoaDon {
    private String maHoaDon;
    private String maKhachHang;
    private String ngayRaHoaDon;
    private double soLuongKwTieuThu;
    private double donGia;

    public HoaDon(String maHoaDon, String maKhachHang, String ngayRaHoaDon, double soLuongKwTieuThu, double donGia) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuongKwTieuThu = soLuongKwTieuThu;
        this.donGia = donGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoLuongKwTieuThu() {
        return soLuongKwTieuThu;
    }

    public void setSoLuongKwTieuThu(double soLuongKwTieuThu) {
        this.soLuongKwTieuThu = soLuongKwTieuThu;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {

        if(Validate.validateMaKHVN(getMaKhachHang())){
            double dinhMucTieuThu = FuncWriteRead.docKhachHangVietNam(getMaKhachHang()).getDinhMucTieuThu();
            if(getSoLuongKwTieuThu()< dinhMucTieuThu){
                return getSoLuongKwTieuThu()*getDonGia();
            }else {
                return getSoLuongKwTieuThu()*getDonGia()*dinhMucTieuThu+
                        (getSoLuongKwTieuThu()-dinhMucTieuThu)*2.5;
            }
        }else {
            return getSoLuongKwTieuThu()*getDonGia();
        }
    }



    public void showInfor() {
        System.out.println( "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuongKwTieuThu=" + soLuongKwTieuThu +
                ", donGia=" + donGia +
                ", thanhTien=" + getThanhTien() +
                '}');
    }

    @Override
    public String toString() {
        return maHoaDon +
                "," + maKhachHang +
                "," + ngayRaHoaDon +
                "," + donGia +
                "," + getThanhTien();
    }
}
