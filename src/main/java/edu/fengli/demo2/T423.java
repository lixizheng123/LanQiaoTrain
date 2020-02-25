package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        sign(n);
    }
    public static void sign(double n){
        if (n > 0) {
            System.out.println(1);
        }else if(n == 0){
            System.out.println(0);
        }else {
            System.out.println(-1);
        }
    }
}
