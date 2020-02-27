package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T591 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]){
                    int temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = (char) temp;
                }
            }
        }
        System.out.println(new String(chars));
    }
}
