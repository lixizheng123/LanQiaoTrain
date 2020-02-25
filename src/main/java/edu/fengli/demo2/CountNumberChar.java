package edu.fengli.demo2;

import java.util.Scanner;

/**
 *  0-9: 48-57
 * @author Administrator
 */
public class CountNumberChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            int charAscii = chars[i];
            if (charAscii >= 48 && charAscii <= 57){
                count++;
            }
        }

        System.out.println(count);
    }
}
