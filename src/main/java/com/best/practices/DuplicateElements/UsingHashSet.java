package com.best.practices.DuplicateElements;

import java.util.HashSet;

public class UsingHashSet {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,2,1};

        HashSet<Integer> seen = new HashSet<>();

        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Dublicate elements: "+ duplicates );
    }
}
