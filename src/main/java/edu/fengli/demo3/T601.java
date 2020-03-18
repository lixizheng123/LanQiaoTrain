package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        scanner.close();

        double area = 0, girth=0;
        area = r * r * 3.14;
        girth = 3.14 * r * 2;

    }
}
