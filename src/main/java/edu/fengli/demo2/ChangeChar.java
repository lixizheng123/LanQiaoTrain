package edu.fengli.demo2;

import java.util.Scanner;

/**
 * a (ASCII): 97
 * A (ASCII): 65
 * @author Administrator
 */
public class ChangeChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(change(s));
    }

    public static String change(String s){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars){
            if ((int) c < 97){
                char c1 = (char) (((int) c) + 32);
                stringBuilder.append(c1);
            }else {
                stringBuilder.append((char)((int) c - 32));
            }
        }
        return stringBuilder.toString();
    }
}
