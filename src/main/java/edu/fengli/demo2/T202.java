package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().replaceAll(" ", ""));
        String[] s = scanner.nextLine().split(" ");
        scanner.close();
        int sum = 0;
        for (String value : s) {
            int number = Integer.parseInt(value);
            sum += number;
        }
        System.out.println(sum / n);
    }
}
