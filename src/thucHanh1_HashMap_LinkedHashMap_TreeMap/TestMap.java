package thucHanh1_HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        System.out.println("*********HashMap*********");
        hashMap.put("b", 30);
        hashMap.put("c", 26);
        hashMap.put("D", 20);
        hashMap.put("e", 19);
        System.out.println("in ra hashMap: ");
        System.out.println(hashMap + "\n");

        System.out.println("******TreeMap*********");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        System.out.println("****LinkedHashMap*****");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Hoàng Thành", 30);
        linkedHashMap.put("Công Biển", 31);
        linkedHashMap.put("Văn Tuấn", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
        System.out.println("\n tuổi của Cook  "+linkedHashMap.get("Cook"));
    }
}
