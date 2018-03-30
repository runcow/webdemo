package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/7.
 */
public class MagicSquare {
    /**
     * 只能穷举法 列出所有可能的情况 分顺时针、逆时针
     * @param s
     * @return
     */
    static int formingMagicSquare(int[][] s) {
        int allSquare[][][] = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };
        int minCost = 0;
        for (int i = 0; i < allSquare.length; i++){
            int temp = 0;
            for (int j = 0; j < 3; j++)
                for (int t = 0; t < 3; t++) {
                    temp += Math.abs(s[j][t] - allSquare[i][j][t]);
                }
            if (i == 0){
                minCost = temp;
            } else {
                minCost = minCost < temp ? minCost : temp;
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for (int s_i = 0; s_i < 3; s_i++) {
            for (int s_j = 0; s_j < 3; s_j++) {
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}
