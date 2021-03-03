package ua.com.alevel;

import java.util.*;

public class HashResetting {

    public static void main(String[] args) {

        TreeMap<String, String> mapToSwap = new TreeMap<>();
        mapToSwap.put("one", "один");
        mapToSwap.put("two", "два");
        mapToSwap.put("three", "три");
        mapToSwap.put("four", "четыре");
        mapToSwap.put("five", "пять");

        keyValueSwapping(mapToSwap);

        System.out.println("Result: " + mapToSwap);
    }

    public static Map<String, String> keyValueSwapping(TreeMap<String, String> testMap) {
        for (int i = 0; i < testMap.size(); i++) {
            testMap.put(testMap.firstEntry().getValue(), testMap.pollFirstEntry().getKey());
        }
        return testMap;
    }
}
