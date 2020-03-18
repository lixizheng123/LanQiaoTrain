package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
       int count = 0;
        for (int i = 1; i <= nextInt; i++) {
            if (nextInt % i == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
