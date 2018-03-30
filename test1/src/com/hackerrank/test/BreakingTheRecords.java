package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/6.
 */
public class BreakingTheRecords {

    static int[] breakingRecords(int[] score) {
        int[] result = new int[2];

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int best = score[0];
        int worst = score[0];
        for (int n : score){
            if (n > best){
                list1.add(n);
                best = n;
            } else if (n < worst){
                list2.add(n);
                worst = n;
            }
        }

        result[0] = list1.size();
        result[1] = list2.size();

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
