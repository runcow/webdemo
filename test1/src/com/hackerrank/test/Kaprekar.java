package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/5.
 */
public class Kaprekar {

    static int[] kaprekarNumbers(int p, int q) {
        if(p > q){
            int t = p;
            p = q;
            q = t;
        }
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = p ;i <= q ;i++){
            long square = (long)i*i;
            String squareStr = String.valueOf(square);
            int len = squareStr.length();
            String l = squareStr.substring(0,len/2);
            String r = squareStr.substring(len/2);
            int lD = l.length() == 0 ? 0 : Integer.parseInt(l);
            int rD = r.length() == 0 ? 0 : Integer.parseInt(r);
            if (lD + rD == i){
                arr.add(i);
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < result.length;i++){
            result[i] = arr.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        int[] result = kaprekarNumbers(p, q);
        if (result.length == 0){
            System.out.println("INVALID RANGE");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");
        }

        in.close();
    }

}
