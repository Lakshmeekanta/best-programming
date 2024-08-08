package com.best.practices.DuplicateElements;

public class UsingBruteForce {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}
