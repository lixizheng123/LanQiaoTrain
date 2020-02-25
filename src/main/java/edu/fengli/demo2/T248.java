package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T248 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();

        for (int i = 1; i <= nextInt; i++) {
            for (int j = nextInt; j >= 1; j--) {
                if (i * j == nextInt){
                    System.out.println(i + " * " + j + " = " + nextInt);
                }
            }
        }
    }
}
