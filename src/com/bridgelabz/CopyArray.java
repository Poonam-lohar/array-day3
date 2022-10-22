package com.bridgelabz;

public class CopyArray {
    public static void main(String[] args) {
        String name[] = {"Poonam", "Suraj", "Roshani", "Shivam"};
        String namesCopy[] = new String[name.length];

        for (int i = 0; i < name.length; i++) {
            namesCopy[i] = name[i];
        }
        for (int i = 0; i < namesCopy.length; i++) {
            System.out.println("Copied names= " + namesCopy[i]);
        }
    }
}
