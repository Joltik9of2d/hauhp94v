package bai12_java_collection_framework.bai_tap_them;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "abcabcabdhuynhphuochau";
        Map<String, Integer> map = new TreeMap<>();
        String[] array = string.split("");
        for (int i = 0; i < string.length(); i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i])+1);
            }
        }
        Set<String> key = map.keySet();
        for (String k : key) {
            System.out.println("chữ: " + k + " xuất hiện " + map.get(k)+ " lần");
        }
    }
}
