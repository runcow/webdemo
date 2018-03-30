package com.hackerrank.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/6.
 */
public class PickingNumbers {
    static int pickingNumbers(int[] a) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : a){
            if (map.containsKey(n)){
                map.put(n,map.get(n) + 1);
            } else {
                map.put(n,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int pre = map.get(entry.getKey()+1) == null ? 0 : map.get(entry.getKey()+1);
            //int suf = map.get(entry.getKey()-1) == null ? 0 : map.get(entry.getKey()-1);
            int t = entry.getValue() + pre;
            if (t > result){
                result = t;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
