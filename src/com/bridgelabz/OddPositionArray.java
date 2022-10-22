package com.bridgelabz;

public class OddPositionArray {
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("original array: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print("  " + number[i]);
        }
        System.out.println();
        System.out.println("Even position elements of array: ");
        for (int i = 1; i < number.length; i=i+2) {
            System.out.print("  " + number[i]);
        }
    }
}
