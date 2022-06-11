package models;

public class KhachHangVietNam extends KhachHang {
    private String loaiKhachHang;
    private double dinhMucTieuThu;

    public KhachHangVietNam(String maKhachHang, String hoTen, String loaiKhachHang, double dinhMucTieuThu) {
        super(maKhachHang, hoTen);
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public double getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(double dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public void showInfor() {
        System.out.println( "KhachHangVietNam{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                ", dinhMucTieuThu=" + dinhMucTieuThu +
                '}');
    }

    @Override
    public String toString() {
        return super.toString() +
                ","+ loaiKhachHang +
                ","+ dinhMucTieuThu ;
    }
}
