package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int a = parse(s[0]);
        int b = parse(s[1]);
        String str = (a + b) + "";
        System.out.println(parse(str));
    }
    public static int parse(String strNumber){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = strNumber.length() - 1; i >= 0 ; i--) {
            if (strNumber.charAt(i) == '0' && count == 0){
                count ++;
            }else {
                sb.append(strNumber.charAt(i));
                count ++;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
