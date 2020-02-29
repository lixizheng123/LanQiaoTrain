package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().toCharArray()[0];
        if ((int) c >= 97 && (int) c <= 122){
            System.out.println("lower");
        }else {
            System.out.println("upper");
        }
    }
}
