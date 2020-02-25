package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();

        System.out.println(f(nextInt, ""));
    }

    private static String f(int n,String str){
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "1";
        }
        return  f(n - 2,str) + f(n - 1,str);
    }
}
