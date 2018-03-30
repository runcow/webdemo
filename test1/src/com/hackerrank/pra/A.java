package com.hackerrank.pra;

import java.util.Arrays;

/**
 * Created by xiezuoyuan on 2018/3/16.
 */
public class A {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 4, 5, 3, 9, 0};
        System.out.println(Arrays.toString(a));
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a) {
        if (a.length > 0) {
            quickSort(a, 0, a.length - 1);
        }
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low>high){
            return;
        }
        int i=low,j=high;
        int key=a[low];
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
        a[i]=a[low];
        a[low]=t;
        quickSort(a,low,i-1);
        quickSort(a,j+1,high);
    }

}
