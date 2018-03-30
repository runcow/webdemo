package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/13.
 */
public class DrawingBook {
    static int solve(int n, int p){
        int page = p/2;
        int totalPages = n/2;
        return page<(totalPages+1)/2?page:(totalPages-page);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
