package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int l = Integer.parseInt(s[1]);
        String s1 = jie(n) + "";
        if (s1.length() >= l) {
            System.out.println("s1 = " + s1);
            System.out.println(s1.substring(s1.length() - l));
        }else {
            int i = l - s1.length();
            while (i > 0){
                System.out.print("0");
                i--;
            }
            System.out.print(s1);
        }
    }
    public static long jie(int n){
        if (n == 1 || n == 0){
            return n;
        }else {
            return n * jie(n -1);
        }
    }
}
