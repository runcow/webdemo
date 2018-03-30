package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/8.
 */
public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int s) {
        int sum = 0;
        for (int k : keyboards)
            for (int d : drives) {
                int t = k + d;
                if (t == s)
                    return s;
                if (t < s)
                    sum = t > sum ? t : sum;
            }
        return sum == 0 ? -1 : sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for (int drives_i = 0; drives_i < m; drives_i++) {
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
