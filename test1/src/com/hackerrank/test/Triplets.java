package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/5.
 */
public class Triplets {

    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        int a , b;
        for (int i = 0 ; i < arr.length - 2 ; i++){
            a = arr[i];
            for (int j = i + 1 ; j < arr.length - 1 ; j++){
                b = arr[j];
                if (b - a == d){
                    for (int t = j ;t < arr.length;t++){
                        if (arr[t] - b == d){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = beautifulTriplets(d, arr);
        System.out.println(result);
        in.close();
    }

}
