package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/5.
 */
public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        int leftSum = 0;
        int rightSum = 0;

        int len = a.length;
        for (int i = 0 ; i < len ; i++){
            leftSum += a[i][i];
            rightSum += a[len-1-i][i];
        }
        return leftSum-rightSum > 0 ? leftSum-rightSum : rightSum - leftSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }

}
