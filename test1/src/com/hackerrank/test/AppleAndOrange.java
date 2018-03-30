package com.hackerrank.test;

/**
 * Created by xiezuoyuan on 2018/3/10.
 */
public class AppleAndOrange {
    /**
     *
     * @param s Starting point of Sam's house location.
     * @param t Ending location of Sam's house location.
     * @param a Location of the Apple tree.
     * @param b Location of the Orange tree.
     * @param apples Distance at which each apple falls from the tree.
     * @param oranges Distance at which each orange falls from the tree.
     */
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0, orangeCount = 0;
        for (int ap : apples){
            int dis = a+ap;
            if (dis>=s&&dis<=t){
                appleCount++;
            }
        }
        for (int or : oranges){
            int dis = b+or;
            if (dis>=s&&dis<=t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.print(orangeCount);
    }

    public static void main(String[] args) {
        int a = 5%-1;
        System.out.print(a);
        //Scanner in = new Scanner(System.in);
        //int s = in.nextInt();
        //int t = in.nextInt();
        //int a = in.nextInt();
        //int b = in.nextInt();
        //int m = in.nextInt();
        //int n = in.nextInt();
        //int[] apple = new int[m];
        //for(int apple_i = 0; apple_i < m; apple_i++){
        //    apple[apple_i] = in.nextInt();
        //}
        //int[] orange = new int[n];
        //for(int orange_i = 0; orange_i < n; orange_i++){
        //    orange[orange_i] = in.nextInt();
        //}
        //countApplesAndOranges(s, t, a, b, apple, orange);
        //in.close();
    }
}
