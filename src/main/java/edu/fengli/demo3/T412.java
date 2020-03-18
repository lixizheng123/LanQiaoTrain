package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T412 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(strcmp(s1, s2));
    }

    private static int strcmp(String s1, String s2) {
        if (s1.equals(s2)){
            return 0;
        }else {
            int count1 = 0;
            int count2 = 0;

            for (char c: s1.toCharArray()){
                count1 += c;
            }

            for (char c: s2.toCharArray()){
                count2 += c;
            }

            if (count1 > count2){
                return 1;
            }else {
                return  -1;
            }
        }
    }
}
