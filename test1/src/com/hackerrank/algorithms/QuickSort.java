package com.hackerrank.algorithms;

/**
 * Created by xiezuoyuan on 2018/3/14.
 */
public class QuickSort {

    static void quicksort(int[] a, int left, int right) {
        if (left>right)
            return;
        int i=left,j=right;
        int key=a[left];
        while (i<j){
            while (i<j&&a[j]>key)
                j--;
            while (i<j&&a[i]<=key)
                i++;
            if (i<j){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        int t=a[i];
        a[i]=a[left];
        a[left]=t;
        quicksort(a,left,i-1);
        quicksort(a,j+1,right);
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,4,6,8,9,1,3,5,7};
        quicksort(a,0,a.length-1);
        for (int i : a){
            System.out.print(i+" ");
        }
    }

}
