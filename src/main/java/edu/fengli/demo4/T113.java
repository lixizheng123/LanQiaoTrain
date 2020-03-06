package edu.fengli.demo4;

import java.util.Scanner;

public class T113 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int flag = 0;
        int[] a = new int[6];
        for (int i = 10000; i < 1000000; i++) {
            int sum = 0;
            int j = 0, x = i;

            while (x != 0){
                a[j] = x % 10;
                x /= 10;
                j ++;
            }
            // 统计和
            for (int k = 0; k < j; k++) {
                sum += a[k];
            }
            // 记录首尾相同的次数
            int t = 0;
            for (int k = 0; k < j / 2; k++) {
                if (a[k] == a[j - k - 1]){
                    t ++;
                }
            }
            if (t == j / 2 && sum == n){
                System.out.println(i);
            }else {
                flag ++;
            }

        }
        if (flag == 1000000 - 10000) {
            System.out.println("-1");
        }

    }
}