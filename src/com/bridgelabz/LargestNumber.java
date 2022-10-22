package com.bridgelabz;

public class LargestNumber {
    public static void main(String[] args) {
        int number[] = {2, 3, 4, 5, 6, 7};
        int max = Integer.MIN_VALUE;
        int i;
        for (  i = 0; i < number.length; i++) ;
        {
            if (number[i]>max)
            {
                max=number[i];
            }
        }
        System.out.println(max);
    }
}
