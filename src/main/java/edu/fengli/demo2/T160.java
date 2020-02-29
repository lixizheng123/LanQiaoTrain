package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        String[] instructs = scanner.nextLine().split(" ");
        String oder = "";
        char c1 = ' ';
        char c2 = ' ';
        StringBuilder sb = new StringBuilder();
        if (instructs.length == 3){
            oder = instructs[0];
            c1 = instructs[1].toCharArray()[0];
            c2 = instructs[2].toCharArray()[0];
            boolean flag = true;
            char[] chars1 = new char[nextLine.length() + 1];
            int index = nextLine.length();
            if ("I".equals(oder)) {
                for (int i = chars.length - 1; i >= 0; i--) {
                    boolean b = c1 == chars[i];
                    if (b && flag) {
                        chars1[index] = chars[i];
                        index --;
                        chars1[index] = c2;
                        index --;
                        flag = false;
                    } else {
                        chars1[index] = chars[i];
                        index --;
                    }
                }
                System.out.println(chars1);
            }else if ("R".equals(oder)){
                for (char c : chars) {
                    boolean b = c == c1;
                    if (b){
                        sb.append(c2);
                    }else {
                        sb.append(c);
                    }
                }
                System.out.println(sb);
            }
        }else if (instructs.length == 2){
            c1 = instructs[1].toCharArray()[0];
            boolean flag = true;
            for (char aChar : chars) {
                boolean b = c1 == aChar;
                if (b && flag) {
                    flag = false;
                } else {
                    sb.append(aChar);
                }
            }
            System.out.println(sb);
        }

    }
}
