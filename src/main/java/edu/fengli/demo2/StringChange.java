package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class StringChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");

        int n = Integer.parseInt(strings[0]);

        switch (n){
            case 1:  result1(strings[1]); break;
            case 2:  result2(strings[1]); break;
            case 3:  result3(strings[1]); break;
            case 4:  result4(strings[1]); break;
            case 5:  result5(strings[1]); break;

            default:break;
        }

    }

    private static void result5(String string) {
        String s = string.toLowerCase();
        System.out.println(s);
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 2;
        for (int i = 0; i < chars.length; i++) {
            int charAscii = 0;
            int nextCharAscii = 0;
            if (i != chars.length -1) {
                 charAscii= chars[i];
                 nextCharAscii = chars[i + 1];
            }
            if (charAscii + 1 == nextCharAscii){
                count++;
                sb.append(chars[i]);
                i += count;
            }else {
                if (count != 2) {
                    sb.append("-");
                }
                sb.append(chars[i]);
            }
        }
        System.out.println(sb);
    }

    private static void result4(String string) {
        // a - z(ASCII): 97-122
        // A - Z (ASCII): 65-90
        char[] chars = string.toCharArray();
        for (int charAscii : chars) {
            if (charAscii >= 97 && charAscii <= 122) {
                System.out.print((char) (charAscii - 32));
            } else {
                System.out.print((char) (charAscii + 32));
            }
        }
    }

    private static void result3(String string) {
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0 ;i--){
            System.out.print(chars[i]);
        }
    }

    private static void result2(String string) {
        System.out.println(string.toLowerCase());
    }

    private static void result1(String string){
        System.out.println(string.toUpperCase());
    }
}
