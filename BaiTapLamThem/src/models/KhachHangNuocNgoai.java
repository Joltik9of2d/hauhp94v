package models;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String quocTich) {
        super(maKhachHang, hoTen);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void showInfor() {
        System.out.println( "KhachHangNuocNgoai{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", quocTich='" + quocTich + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return super.toString()
                +","+ quocTich ;
    }
}
