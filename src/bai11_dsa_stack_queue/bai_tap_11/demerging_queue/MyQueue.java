package bai11_dsa_stack_queue.bai_tap_11.demerging_queue;

import java.time.LocalDate;
import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        Queue<NhanVien> NU = new PriorityQueue<>();
        Queue<NhanVien> NAM = new PriorityQueue<>();
        Queue<NhanVien> nhanVien = new PriorityQueue<NhanVien>();
        nhanVien.add(new NhanVien("hau", true, LocalDate.of(1994, 1, 1)));
        nhanVien.add(new NhanVien("nam", true, LocalDate.of(1995, 2, 3)));
        nhanVien.add(new NhanVien("hong", false, LocalDate.of(1990, 12, 1)));
        nhanVien.add(new NhanVien("lan", false, LocalDate.of(1997, 5, 20)));
        nhanVien.add(new NhanVien("Han", true, LocalDate.of(1989, 8, 20)));
        nhanVien.add(new NhanVien("Hoa", false, LocalDate.of(1988, 3, 20)));

        System.out.println("Sap xep theo ngay sinh: ");
        while (nhanVien.size() != 0) {
            if (nhanVien.peek().isGender()) {
                NAM.add(nhanVien.poll());
            } else NU.add(nhanVien.poll());
        }
        System.out.println("Danh sách nhân viên nữ: ");
        while (NU.size() != 0) {
            System.out.println(NU.poll());
        }
        System.out.println("Danh sách nhân viên nam: ");
        while (NAM.size() != 0) {
            System.out.println(NAM.poll());
        }


    }


}
