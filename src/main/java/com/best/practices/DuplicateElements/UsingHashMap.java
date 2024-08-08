package com.best.practices.DuplicateElements;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
