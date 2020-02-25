package edu.fengli.demo2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class T298 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
    }
    public static int d(int number){
        int count = 0;
        String s = number + "";
        for (int i = 0;i < s.length();i++){
            int n = Integer.parseInt(s.charAt(i) + "");
            count += n;
        }
        return count + number;
    }
}
