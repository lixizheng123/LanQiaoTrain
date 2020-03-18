package edu.fengli.test;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int p = 0;
        int aa = 0;
        int bb = 0;
        int cc = 0;
        int dd = 0;
        while (p < nextLine.length() && !parseYuan(nextLine.charAt(p))){
            aa = 1;
            p ++;
        }
        while (p < nextLine.length() && parseYuan(nextLine.charAt(p))){
            bb = 1;
            p ++;
        }
        while (p < nextLine.length() && !parseYuan(nextLine.charAt(p))){
            cc = 1;
            p ++;
        }
        while (p < nextLine.length() && parseYuan(nextLine.charAt(p))){
            dd = 1;
            p ++;
        }
        if (aa == 1 && bb == 1 && cc == 1 && dd == 1){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

    public static boolean parseYuan(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
