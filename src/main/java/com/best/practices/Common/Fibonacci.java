package com.best.practices.Common;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms");
        int number = 6;
        int first = 0, second = 1, next;
        System.out.print("Fibonacci series is ");
        for (int i = 0; i <= number; i++) {
            System.out.print(first + " ");
            next = second + first;
            first = second;
            second = next;
        }
    }
}