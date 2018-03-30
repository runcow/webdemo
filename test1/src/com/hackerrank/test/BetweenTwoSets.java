package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/11.
 */
public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        //a的最小公倍数
        int aLcm = a[0];
        for (int i = 1;i<a.length;i++){
            aLcm = lcm(aLcm,a[i]);
        }
        int bGcd = b[0];
        for (int i = 1;i<b.length;i++){
            bGcd = gcd(bGcd,b[i]);
        }
        int result = 0;
        for (int i = aLcm;i<=bGcd;i=i+aLcm){
            if (i%aLcm==0&&bGcd%i==0)
                result++;
        }
        return result;
    }

    /**
     * 最大公约数
     * @param a
     * @param b
     * @return
     */
    static int gcd(int a , int b){
        while (b > 0){
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    /**
     * 最小公倍数
     * @param a
     * @param b
     * @return
     */
    static int lcm(int a , int b){
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
