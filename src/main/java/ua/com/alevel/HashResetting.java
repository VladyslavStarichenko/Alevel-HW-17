package ua.com.alevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashResetting {

    public static void main(String[] args) {

        Map<String, String> mapToSwap = new HashMap<>();
        mapToSwap.put("one", "один");
        mapToSwap.put("two", "два");
        mapToSwap.put("three", "три");
        mapToSwap.put("four", "четыре");
        mapToSwap.put("five", "пять");

        keyValueSwapping(mapToSwap);

        System.out.println("Result: " + mapToSwap);
    }

    public static Map<String, String> keyValueSwapping(Map<String, String> testMap) {

        List<String> tempKeyList = new ArrayList<>();
        List<String> tempValueList = new ArrayList<>();

        for (Map.Entry<String, String> entry : testMap.entrySet()) {
            tempKeyList.add(entry.getKey());
            tempValueList.add(entry.getValue());
        }

        testMap.clear();

        for(int i = 0; i < tempKeyList.size(); i ++) {
            testMap.put(tempValueList.get(i), tempKeyList.get(i));
        }

        return testMap;
    }
}
