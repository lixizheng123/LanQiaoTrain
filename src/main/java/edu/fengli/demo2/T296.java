package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T296 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();

        for (int i = 1; i <= 10000; i++) {
            int count = 0;
            int j;
            for (j = i; j <= 10000; j++) {
                count += j;
                if (count == nextInt && i != j){
                    System.out.println(i + " " + j);
                }
            }

        }
    }
}
