package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T217{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        Integer integer = Integer.valueOf(nextLine, 2);
        System.out.println(integer);
    }
}
