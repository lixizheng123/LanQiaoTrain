package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println((a * a) % m);
    }
}
