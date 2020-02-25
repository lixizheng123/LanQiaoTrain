package edu.fengli.demo2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] s = nextLine.split(" ");
        char[] one = s[0].toCharArray();
        char[] two = s[1].toCharArray();
        if (s[0].equals(s[1])){
            System.out.println(0);
        }else {
            int end = 0;
            for (int i = 0; i < one.length; i++) {
                boolean b = one[i] == two[i];
                if (!b){
                    end = one[i] - two[i];
                    break;
                }
            }
            System.out.println(end);
        }
    }
}
