package com.best.practices.DuplicateElements;

import java.util.Arrays;

public class UsingSorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6};
        
        Arrays.sort(array);

        System.out.print("Duplicate elements: ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
