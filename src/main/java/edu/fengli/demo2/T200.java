package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            boolean b = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
            if (b){
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
    }
}
