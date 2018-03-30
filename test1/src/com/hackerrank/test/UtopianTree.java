package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/9.
 */
public class UtopianTree {
    static int utopianTree(int n) {
        int result = 1;
        for (int i = 1 ; i <= n ; i++){
            if (i % 2 == 1){
                result = result * 2;
            } else {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = utopianTree(n);
            System.out.println(result);
        }
        in.close();
    }
}
