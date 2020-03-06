package edu.fengli.demo2;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = i;
            int b = i + 1;
            int c = i + 2;
            boolean pan = pan(a, b, c);
            if (pan){
                count ++;
            }
        }
        System.out.println(count);
    }

    private static boolean pan(int a, int b, int c) {
     return false;
    }
}
