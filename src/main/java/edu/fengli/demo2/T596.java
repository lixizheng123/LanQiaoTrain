package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        for (char c : chars) {
            if ((int) c >= 65 && (int) c <= 90){
                int i = (int) c + 32;
                System.out.print((char) i);
            }else {
                int i = (int) c - 32;
                System.out.print((char) i);
            }
        }
    }
}
