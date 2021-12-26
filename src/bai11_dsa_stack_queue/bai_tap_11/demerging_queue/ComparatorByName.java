package bai11_dsa_stack_queue.bai_tap_11.demerging_queue;

import java.util.Comparator;

public class ComparatorByName implements Comparator<NhanVien> {

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
