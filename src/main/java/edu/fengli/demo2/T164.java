package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        int aCharAscii = chars[0];
        if (aCharAscii >= 48 && aCharAscii <= 57){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
