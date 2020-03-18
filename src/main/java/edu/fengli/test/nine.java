package edu.fengli.test;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        boolean flag = false;
        for (int i = 1; i <= nextInt; i++) {
            for (int j = 1; j <= nextInt; j++) {
                if (i > j){
                    System.out.println(i + " " + j);
                    flag = true;
                }else {
                    flag = false;
                }
                for (int k = j; k <= nextInt; k++) {
                    boolean b = Math.abs(i - j) < k && flag;
                    if (b){
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
