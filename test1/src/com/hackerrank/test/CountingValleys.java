package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/6.
 */
public class CountingValleys {
    static int countingValleys(int n, String s) {
        int seaLevel = 0 , countUp = 0 , countDown = 0;
        char[] cs = s.toCharArray();
        for (int i = 0 ; i < n; i++){
            if (cs[i] == 'U'){
                countUp += (seaLevel++==-1&&seaLevel==0) ? 1 : 0;
            } else {
                countDown += (seaLevel--==0&&seaLevel==-1) ? 1 : 0;
            }
        }
        return Math.min(countDown,countUp);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
