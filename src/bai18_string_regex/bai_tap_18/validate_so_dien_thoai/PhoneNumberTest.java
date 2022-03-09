package bai18_string_regex.bai_tap_18.validate_so_dien_thoai;

import bai18_string_regex.bai_tap_18.validate_ten_lop_hoc.NameClass;

public class PhoneNumberTest {
    public static PhoneNumber phoneNumber;

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.validate("84935256851"));
        System.out.println(phoneNumber.validate("0935256851"));
        System.out.println(phoneNumber.validate("85935256851"));
    }
}
