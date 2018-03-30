package com.hackerrank.test;

import java.util.*;

/**
 * 1.Use a map to store key with score and value with ranking.
 * 2.int index = scores.length - 1.
 * 3.for each Alice's score , compare from the index asc
 * 4.update index when you find the ranking
 * Created by xiezuoyuan on 2018/3/6.
 */
public class ClimbingTheLeaderboard {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        for(int scores_i = 0; scores_i < n; scores_i++){
            int now = in.nextInt();
            scores[scores_i] = now;
            if (scores_i == 0){
                map.put(now,1);
            } else if (now < pre){
                map.put(now,map.get(pre) + 1);
            }
            pre = now;
        }
        int m = in.nextInt();
        int index = scores.length - 1;
        for(int alice_i = 0; alice_i < m; alice_i++){
            int score = in.nextInt();
            for (int i = index ; i >= 0 ; i--){
                int s = scores[i];
                if (s > score){
                    System.out.println(map.get(s) + 1);
                    index = i;
                    break;
                } else if (s == score){
                    System.out.println(map.get(s));
                    index = i;
                    break;
                } else if (i == 0){
                    System.out.println("1");
                    index = i;
                    break;
                }
            }

        }
        in.close();
    }

}
