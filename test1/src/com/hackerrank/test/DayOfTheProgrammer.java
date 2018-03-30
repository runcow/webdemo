package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/6.
 */
public class DayOfTheProgrammer {

    static boolean isLeapYear(int y){
        return y < 1918 ?  y % 4 == 0 : (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    static String solve(int year){
        return year == 1918 ? "26.09.1918" : (isLeapYear(year) ? "12.09." + year : "13.09." + year);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}
