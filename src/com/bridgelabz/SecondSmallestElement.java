package com.bridgelabz;

public class SecondSmallestElement {
    public static int getSecondSmallest(int[] array,int total)
    {
        int temp;
        for (int i=0;i<total;i++)
        {
           for (int j=i+1;j<total;j++)
           {
               if (array[i]>array[j])
               {
                   temp=array[i];
                   array[i]=array[j];
                   array[j]=temp;
               }
           }
        }
        return array[1];
    }
    public static void main(String[] args) {
        int array[]={1,2,4,3,6};
        System.out.println("smallest: "+getSecondSmallest(array,5));
    }
}
