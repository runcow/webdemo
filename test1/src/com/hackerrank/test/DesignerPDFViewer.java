package com.hackerrank.test;

import java.util.Scanner;

/**
 * Created by xiezuoyuan on 2018/3/8.
 */
public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        for (char c : word.toCharArray()){
            if (h[c-97] > max){
                max =  h[c-97];
            }
        }
        return max*word.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i = 0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
        //System.out.print('a'-97);
    }
}
