package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        scanner.close();
        System.out.println(parse(nextLine));
    }
    public static int parse(String str){
        int index = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean b = str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u';

            if (b) {
                index = i;
                count ++;
                break;
            }
        }
        if (count > 0){
            index += 1;
        }
        return index;
    }
}
