package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int result = get(nextInt);
        if (result == nextInt){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
    public static int get(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && number != i){
                count += i;
            }
        }
        return count;
    }
}
