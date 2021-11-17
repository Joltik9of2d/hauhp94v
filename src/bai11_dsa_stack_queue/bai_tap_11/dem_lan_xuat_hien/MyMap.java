package bai11_dsa_stack_queue.bai_tap_11.dem_lan_xuat_hien;

import java.util.*;

public class MyMap {
    public static int demSoLanXuatHienTrongMang(String[] array, String e) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(e)) {
                count++;
            }
        }
        return count;
    }
    public static void putNewKey(String str, Map<String,Integer> myMap){
        if(myMap.containsKey(str)){
            int a = myMap.get(str)+1;
            myMap.put(str,a);
        }else myMap.put(str,1);
    }

    public static void main(String[] args) {
        String string = "cong hoa xa hoi chu nghia viet nam viet nam viet nam";
        System.out.println(string);
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        Map<String, Integer> myMap = new TreeMap<String, Integer>();
        for (int i = 0; i < array.length; i++) {
            myMap.put(array[i], demSoLanXuatHienTrongMang(array, array[i]));
        }
        myMap.forEach((key, value) -> System.out.println(
                key + ": xuat hien " + value + " lan"));
        System.out.println(myMap);
        String str = "VIET";
        putNewKey(str, myMap);
        System.out.println(myMap);

//        Iterator<String> itr = myMap.keySet().iterator();
//        while (itr.hasNext()) {
//            System.out.println(myMap.get(itr.next()));
//        }

    }
}



