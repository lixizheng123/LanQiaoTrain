package edu.fengli.demo1;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(strncmp(s, t, n));
    }

    public static int strncmp(String s, String t, int n) {
        int lenS = s.length();
        int lenT = t.length();
        t = t.substring(0, n);
        s = s.substring(0, n);
        if (lenS <= lenT){
            return -1;
        }else if (s.equals(t)){
            return 0;
        }else {
            return 1;
        }
    }
}
