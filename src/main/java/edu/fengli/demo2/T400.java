package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T400 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        String string = Integer.toBinaryString(nextInt);
        System.out.println(string.length());
    }
}
