package edu.fengli.demo2;


import java.util.Scanner;

/**
 * @author Administrator
 */
public class T410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        EncryptChar(nextLine);

    }

    public static String EncryptChar(String string){
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'Z'){
                sb.append("a");
            }else if(chars[i] == 'z'){
                sb.append("A");
            }else {
                boolean max = chars[i] >= 65 && chars[i] <= 90;
                boolean min = chars[i] >= 97 && chars[i] <= 122;
                if (max || min) {
                    int ascii = chars[i];
                    sb.append((char) (ascii + 1));
                }else {
                    sb.append(chars[i]);
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
