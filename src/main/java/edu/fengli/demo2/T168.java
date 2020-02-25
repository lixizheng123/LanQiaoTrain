package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        for (int i = nextLine.length() - 1; i >= 0 ; i--) {
            System.out.print(nextLine.charAt(i));
        }
    }
}
