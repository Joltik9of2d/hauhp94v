package bai11_dsa_stack_queue.bai_tap_11.demerging_queue;

import java.time.LocalDate;
import java.util.*;

public class MyQueue {
    public static void main(String[] args) {
        Queue<NhanVien> outPut = new LinkedList<>();
        Queue<NhanVien> NU = new PriorityQueue<>();
        Queue<NhanVien> NAM = new PriorityQueue<>();
        Queue<NhanVien> nhanVien = new PriorityQueue<>();
        nhanVien.add(new NhanVien("Hau", true, LocalDate.of(1994, 1, 1)));
        nhanVien.add(new NhanVien("Binh", true, LocalDate.of(1995, 2, 3)));
        nhanVien.add(new NhanVien("Hong", false, LocalDate.of(1990, 12, 1)));
        nhanVien.add(new NhanVien("Lan", false, LocalDate.of(1997, 5, 20)));
        nhanVien.add(new NhanVien("Han", true, LocalDate.of(1989, 8, 20)));
        nhanVien.add(new NhanVien("Hoa", false, LocalDate.of(1988, 3, 20)));
        nhanVien.add(new NhanVien("Anh", false, LocalDate.of(2000, 9, 25)));

        while (nhanVien.size() != 0) {
            if (nhanVien.peek().isGender()) {
                NAM.add(nhanVien.poll());
            } else NU.add(nhanVien.poll());
        }
        while (NU.size()!=0){
            outPut.add(NU.poll());
        }
        while (NAM.size()!=0){
            outPut.add(NAM.poll());
        }
        System.out.println("Danh sách nhân viên nữ trước nam sau và theo ngày sinh: ");
        while (outPut.size()!=0){
            System.out.println(outPut.poll());
        }
    }
}
