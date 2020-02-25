package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T251 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        scanner.close();
        int alpha = alpha(nextLine);
        System.out.println(alpha);

    }
    public static int alpha(String str){
        if (str.length() == 1){
            return Integer.parseInt(str);
        }else {
            String oneAlpha = getOneAlpha(str);
            return alpha(oneAlpha);
        }
    }

    public static String getOneAlpha(String string){
        int end = 1;
        for (int i = 0; i < string.length(); i++) {
            if ('0' == string.charAt(i)){
                continue;
            }else {
                int n = Integer.parseInt(string.charAt(i) + "");
                end *= n;
            }
        }

        return end+ "";
    }
}
