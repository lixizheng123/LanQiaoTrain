package edu.fengli.demo4;

import java.util.Scanner;
/**
 * @author Administrator
 */
public class T444 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n, k;
        n = cin.nextInt();
        k = cin.nextInt();

        //最后结果会超 int
        Long ans = 0L;
        //前缀和
        int[] sum = new int[100005];
        //前缀和取模后出现的次数
        int[] cnt = new int[100005];

        cnt[0] = 1;
        for(int i=1; i<=n; i++) {
            int t = cin.nextInt();
            sum[i] = (sum[i-1] + t) % k;

            ans += cnt[sum[i]];
            cnt[sum[i]] ++;
        }
        System.out.println(ans);
    }

}