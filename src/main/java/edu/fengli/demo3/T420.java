package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int start = scanner.nextInt();
        int step = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i < s.length(); i += step) {
            stringBuilder.append(s.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
