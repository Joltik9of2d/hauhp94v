package bai14_thuat_toan_sap_xep.bai_tap_14.cai_dat_sap_xep_chen;

import java.util.Arrays;

public class InsertSort {
    public static void  insertSort (int [] array) {
        for (int  i =  1 ; i < array.length; i++) {
            int  temp = array[i];
            int  j = i - 1 ;
            while  (j >= 0 && array[j] > temp) {
                // Moves the value greater than temp back by one unit
                array [j + 1] = array [j];
                j--;
            }
            array [j + 1] = temp;
        }
        System.out.println(Arrays.toString(array) + " insertSort");
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,7,2,4,9,45,2,6};
        insertSort(array);
    }
}
