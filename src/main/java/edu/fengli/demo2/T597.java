package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        di(nextInt);
    }
    public static int di(int number){
        if (number <= 0){
            return 0;
        }else {
            System.out.print(number % 10);
            return di(number / 10);
        }
    }
}
