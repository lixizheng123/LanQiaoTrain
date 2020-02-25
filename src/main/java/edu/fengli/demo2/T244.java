package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
}
