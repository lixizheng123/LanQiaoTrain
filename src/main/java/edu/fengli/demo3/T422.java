package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T422 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int p = Integer.parseInt(s[2]);
        if (n >= m){
            long l = jie(n) - jie(m);
            long result = l % p;
            System.out.println(result);
        }
    }
    public static long jie(int number){
        if (number == 1 || number == 0){
            return number;
        }else {
            return number * jie(number -1);
        }
    }
}
