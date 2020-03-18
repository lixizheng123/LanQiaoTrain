package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        String s = Integer.toBinaryString(nextInt);
        for (int i = s.length(); i < 8; i++) {
            s = '0' + s;
        }
        if (nextInt < 0){
            s = s.substring(24);
        }
        System.out.println(s);
    }
}
