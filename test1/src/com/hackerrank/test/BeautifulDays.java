package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/10.
 */
public class BeautifulDays {
    static int beautifulDays(int i, int j, int k) {
        int result = 0;
        for (int n = i ; n <= j ; n++){
            if (Math.abs(n-reverseNumber(n))%k==0){
                result++;
            }
        }
        return result;
    }

    static int reverseNumber(int n){
        String str = String.valueOf(n);
        while (str.endsWith("0")){
            str = str.substring(0,str.length()-1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1 ; i >= 0 ;i--){
            stringBuilder.append(str.charAt(i));
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
