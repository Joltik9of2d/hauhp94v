package bai14_thuat_toan_sap_xep.bai_tap_14.minh_hoa_sap_xep_chen;

import java.util.Arrays;

public class InsertSortByStep {
    public static void  insertSort (int [] array) {
        for (int  i =  1 ; i < array.length; i++) {
            int  temp = array[i];
            int  j = i - 1 ;
            System.out.println("lần lặp "+i);
            for  (; j >= 0 && array[j] > temp; j--) {
                System.out.println("so sánh "+array[j+1]+ " và " +array[j]);
//                 Moves the value greater than temp back by one unit
                array [j + 1] = array [j];
            }
            System.out.println(Arrays.toString(array));

            array [j + 1] = temp;
        }
        System.out.println(Arrays.toString(array) + " insertSort");
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,7,2,4,9,45,2,6};
        System.out.println(Arrays.toString(array));
        insertSort(array);
    }
}
