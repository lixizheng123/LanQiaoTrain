package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l1 = scanner.nextLine();
        String l2 = scanner.nextLine();
        l1 = l1.toUpperCase();
        l2 = l2.toUpperCase();
        boolean parse = parse(l1, l2);
        if (parse){
            System.out.println("Y");
        }else {
            System.out.println("N");
        }

    }
    public static boolean parse(String s1, String s2){
        boolean flag = false;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                boolean b = s1.charAt(i) == s2.charAt(j);
                if (b){
                    flag = true;
                    break;
                }else {
                    flag = false;
                }
            }
            if (!flag){
                break;
            }
        }
        return flag;
    }
}
