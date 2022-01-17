package bai11_dsa_stack_queue.bai_tap_11.demerging_queue;

import java.time.LocalDate;
import java.util.*;

public class QuanLyNhanVien {
    public static void main(String[] args) {
        Queue<NhanVien> outPut = new ArrayDeque<>();
        Queue<NhanVien> nu = new ArrayDeque<>();
        Queue<NhanVien> nam = new ArrayDeque<>();
        Queue<NhanVien> nhanVien = new PriorityQueue<>();
        nhanVien.add(new NhanVien("Hau", true, LocalDate.of(1994, 1, 1)));
        nhanVien.add(new NhanVien("Binh", true, LocalDate.of(1995, 2, 3)));
        nhanVien.add(new NhanVien("Hong", false, LocalDate.of(1990, 12, 1)));
        nhanVien.add(new NhanVien("Lan", false, LocalDate.of(1997, 5, 20)));
        nhanVien.add(new NhanVien("Han", true, LocalDate.of(1989, 8, 20)));
        nhanVien.add(new NhanVien("Hoa", false, LocalDate.of(1988, 3, 20)));
        nhanVien.add(new NhanVien("Anh", false, LocalDate.of(1988, 3, 21)));
        while (!nhanVien.isEmpty()) {
            if (nhanVien.peek().isGender()) {
                nam.add(nhanVien.poll());
            } else nu.add(nhanVien.poll());
        }
        while (nu.size()!=0){
            outPut.add(nu.poll());
        }
        while (nam.size()!=0){
            outPut.add(nam.poll());
        }
        System.out.println("Danh sách nhân viên nữ trước nam sau và theo ngày sinh: ");
        while (outPut.size()!=0){
            System.out.println(outPut.poll());
        }
    }
}
