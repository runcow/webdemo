package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/5.
 */
public class GradingStudents {

    static int[] solve(int[] grades){
        for (int i = 0 ; i < grades.length ; i++){

            int g = grades[i];

            if (g < 38){
                continue;
            }

            int r = 5 - g % 5;
            if ( r < 3){
                grades[i] = grades[i] + r;
            }

        }
        return grades;
    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] r = new int[2];
        if(a0 > b0){
            r[0]++;
        } else if (a0 < b0){
            r[1]++;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }

}
