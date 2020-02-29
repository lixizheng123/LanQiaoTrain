package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        if (nextLine.length() <= 0){
            System.out.println();
        }else {
            char[] chars = nextLine.toCharArray();
            char a = scanner.nextLine().toCharArray()[0];

            for (char c : chars) {
                if (!(c == a)) {
                    System.out.print(c);
                }
            }
        }
    }
}
