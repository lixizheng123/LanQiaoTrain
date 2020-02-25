package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int one = Integer.parseInt(s[1]);
        int two = Integer.parseInt(s[2]);

        String chars = s[0];

        if ("+".equals(chars)){
            System.out.println(one + two);
        }else if ("-".equals(chars)){
            System.out.println(one - two);
        }else if("*".equals(chars)){
            System.out.println(one*two);
        }else {
            System.out.println(one/two);
        }
    }
}
