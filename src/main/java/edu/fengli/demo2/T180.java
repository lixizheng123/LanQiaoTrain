package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine().replaceAll(" ","");
        String two = scanner.nextLine().replaceAll(" ", "");
        System.out.println(one + two);
    }
}
