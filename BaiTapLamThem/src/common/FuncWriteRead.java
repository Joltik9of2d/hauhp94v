package common;

import models.HoaDon;
import models.KhachHang;
import models.KhachHangNuocNgoai;
import models.KhachHangVietNam;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class FuncWriteRead {
    public static void ghiHoaDonVaoFile(String hoaDon) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/data/hoaDon.csv",true));
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
public static ArrayList<HoaDon> docHoaDon(){
        ArrayList<HoaDon> hoaDonArrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/data/hoaDon.csv"));
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                String temp[] = line.split(",");
                hoaDonArrayList.add(new HoaDon(temp[0],temp[1],temp[2],Double.parseDouble(temp[3]),Double.parseDouble(temp[4])));
                bufferedReader.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return hoaDonArrayList;
}
    public static void ghiKhachHangVaoFile(String khachHang) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/data/khachHang.csv", true));
            bufferedWriter.write(khachHang);
            bufferedWriter.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void ghiDanhSachKhachHangVaoFile(ArrayList<KhachHang> khachHangArrayList) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("src/data/khachHang.csv"));
            for (KhachHang khachHang : khachHangArrayList) {
                bufferedWriter.write(khachHang.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<KhachHang> docDanhSachKhachHang() {
        ArrayList<KhachHang> khachHangArrayList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src/data/khachHang.csv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                if (temp.length == 4) {
                    khachHangArrayList.add(new KhachHangVietNam(temp[0], temp[1], temp[2], Double.parseDouble(temp[3])));
                } else if (temp.length == 3) {
                    khachHangArrayList.add(new KhachHangNuocNgoai(temp[0], temp[1], temp[2]));
                } else {
                    System.out.println("Lỗi rồi");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return khachHangArrayList;
    }

    public static KhachHangVietNam docKhachHangVietNam(String maKhachHang) {
        ArrayList<KhachHangVietNam> khachHangVietNamArrayList = docDanhSachKhachHangVietNam();
        for (KhachHangVietNam khachHangVietNam : khachHangVietNamArrayList) {
            if (khachHangVietNam.getMaKhachHang().equals(maKhachHang)) {
                return khachHangVietNam;
            }
        }
        return null;
    }

    public static KhachHangNuocNgoai docKhachHangNuocNgoai(String maKhachHang) {
        ArrayList<KhachHangNuocNgoai> khachHangNuocNgoaiArrayList = docDanhSachKhachHangNuocNgoai();
        for (KhachHangNuocNgoai khachHangNuocNgoai : khachHangNuocNgoaiArrayList) {
            if (khachHangNuocNgoai.getMaKhachHang().equals(maKhachHang)) {
                return khachHangNuocNgoai;
            }
        }
        return null;
    }

    public static ArrayList<KhachHangVietNam> docDanhSachKhachHangVietNam() {
        ArrayList<KhachHangVietNam> khachHangVietNamArrayList = new ArrayList<>();
        for (KhachHang khachHang : FuncWriteRead.docDanhSachKhachHang()) {
            if (khachHang instanceof KhachHangVietNam) {
                khachHangVietNamArrayList.add((KhachHangVietNam) khachHang);
            }
        }
        return khachHangVietNamArrayList;
    }

    public static ArrayList<KhachHangNuocNgoai> docDanhSachKhachHangNuocNgoai() {
        ArrayList<KhachHangNuocNgoai> khachHangNuocNgoaiArrayList = new ArrayList<>();
        for (KhachHang khachHang : FuncWriteRead.docDanhSachKhachHang()) {
            if (khachHang instanceof KhachHangNuocNgoai) {
                khachHangNuocNgoaiArrayList.add((KhachHangNuocNgoai) khachHang);
            }
        }
        return khachHangNuocNgoaiArrayList;
    }

    public static String docLoaiKhachHang(String loaiKhachHang) {
        TreeMap<String, String> mapLoaiKhachHang = new TreeMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/data/loaiKhach.csv"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                mapLoaiKhachHang.put(temp[0], temp[1]);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String i : mapLoaiKhachHang.keySet()) {
            if (mapLoaiKhachHang.get(i).equals(loaiKhachHang)) {
                return i;
            }
        }
        return "Lỗi đọc file loại khách";
    }
}
