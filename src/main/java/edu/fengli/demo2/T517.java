package edu.fengli.demo2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T517 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        String string = scanner.nextLine();
        String[] split = string.split(",");
        // f(f(1,-1),f(1,-1))
        System.out.println(Arrays.toString(split));
    }
}
