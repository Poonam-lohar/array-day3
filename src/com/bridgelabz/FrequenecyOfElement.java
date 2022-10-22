package com.bridgelabz;

public class FrequenecyOfElement {
    public static void main(String[] args) {
        int[] arr=new int[] {1,2,6,7,2,1,3,1,2,9};
        int[] freq =new int[arr.length];
        int visited=-1;
        for (int i=0;i<arr.length;i++) {
            int count=1;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i]==arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i]!=visited)
                freq[i]=count;
        }
        for (int i=0;i<freq.length;i++) {
            if (freq[i]!=visited)
                System.out.println(" "+arr[i]+" = "+freq[i]);
        }

    }
}
