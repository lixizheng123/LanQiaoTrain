package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class BinaryOneCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextLine = Integer.parseInt(scanner.nextLine());
        String s = Integer.toBinaryString(nextLine);
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1'){
                count++;
            }
        }

        System.out.println(count);
    }
}
