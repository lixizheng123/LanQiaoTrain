package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();

        if (nextInt % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
