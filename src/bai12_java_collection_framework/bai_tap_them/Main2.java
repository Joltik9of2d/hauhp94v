package bai12_java_collection_framework.bai_tap_them;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String string = scanner.nextLine();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character charOfString: string.toCharArray()){
            if(!map.containsKey(charOfString)){
                map.put(charOfString,1);
            }else {
                map.put(charOfString,map.get(charOfString)+1);
            }
        }
//        for (int i = 0; i < string.length(); i++) {
//            if (!map.containsKey(string.charAt(i))) {
//                map.put(string.charAt(i), 1);
//            } else {
//                map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
//            }
//        }

        Set<Character> key = map.keySet();
        for (Character k : key) {
            System.out.println("chữ: " + k + " xuất hiện " + map.get(k) + " lần");
        }
    }
}
