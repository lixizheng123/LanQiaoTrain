package edu.fengli.demo3;

import java.util.Scanner;

public class T383 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        System.out.println(a + b);
    }
}
