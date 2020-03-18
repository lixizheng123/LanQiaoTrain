package edu.fengli.demo3;

import java.util.Scanner;

/**
 *  小D接到一项任务，要求他爬到一座n层大厦的顶端与神秘人物会面。
 *  这座大厦有一个神奇的特点，每层的高度都不一样，
 *  同时，小D也拥有一项特殊能力，可以一次向上跳跃一层或两层，但是这项能力无法连续使用。
 *  已知向上1高度消耗的时间为1，跳跃不消耗时间。
 *  由于事态紧急，小D想知道他最少需要多少时间到达顶层。
 * @author Administrator
 */
public class T581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] d = new int[n + 1];
        for (int i = 1; i < d.length; i++) {
            d[i] = scanner.nextInt();
        }

        int[][] dp = new int[n + 1][2];
        dp[1][1] = d[1];
        dp[1][0] = 0;

        if (n + 1 > 3){
            for (int i = 2; i < dp.length; i++) {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i -2][1]);
                dp[i][1] = Math.min(dp[i - 1][0], dp[i -1][1]) + d[i];
            }
        }
        System.out.println(Math.min(dp[n][0], dp[n][1]));
    }
}
