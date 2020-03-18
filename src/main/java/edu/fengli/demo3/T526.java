package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T526 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        long a = Integer.parseInt(s[0]);
        long b = Integer.parseInt(s[1]);
        long c = Integer.parseInt(s[2]);

        long res = 1, prod = a;
        while(b > 0) {
            if((b & 1) == 1) {
                // b的最后一位是1
                res = (res * prod) % c;
            }
            prod = (prod * prod) % c;
            b >>= 1;
        }
        System.out.println(res);
    }
}
