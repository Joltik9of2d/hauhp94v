package bai11_dsa_stack_queue.bai_tap_11.demerging_queue;

import java.time.LocalDate;


public class NhanVien implements Comparable<NhanVien> {
    public String name;
    public boolean gender;
    public LocalDate birthday;

    public NhanVien(String name, boolean gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public String gioiTinh(boolean gender){
        if(gender){
            return "Nam";
        }else return "Nu";
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", gender=" + gioiTinh(gender) +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.birthday.compareTo(o.birthday);
    }
}
