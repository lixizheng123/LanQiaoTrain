package edu.fengli.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            order[i] = num[i];
        }
        sc.close();
        Arrays.sort(order);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = n - m; i < n; i++) {
            list.add(order[i]);
        }
        StringBuilder sb = new StringBuilder("");
        for (int i : num) {
            if (list.contains(i)) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
