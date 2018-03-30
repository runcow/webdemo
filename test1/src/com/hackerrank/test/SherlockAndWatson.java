package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/14.
 */
public class SherlockAndWatson {
    static int[] circularArrayRotation(int[] a, int[] m,int k) {
        int[] rotationA = new int[a.length];
        for (int i = 0;i<a.length;i++){
            rotationA[(i+k)%a.length] = a[i];
        }
        for (int i=0;i<m.length;i++){
            m[i] = rotationA[m[i]];
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] m = new int[q];
        for(int m_i = 0; m_i < q; m_i++){
            m[m_i] = in.nextInt();
        }
        int[] result = circularArrayRotation(a, m,k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
