package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T169 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i < s.length; i++) {
            if (max < s[i].length()){
                max = s[i].length();
                maxIndex = i;
            }
        }
        System.out.println(s[maxIndex]);
    }
}
