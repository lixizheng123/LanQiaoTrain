package edu.fengli.demo2;

import java.util.Scanner;

/**
 * a : 97
 * A : 65
 * @author Administrator
 */
public class AdjacentLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        char aChar = chars[0];
        int aCharAscII = aChar;
        StringBuilder sb = new StringBuilder();

        if (aCharAscII >= 65 && aCharAscII < 97){
            if (aCharAscII == 65){
                sb.append( "Z");
                sb.append( aChar);
                sb.append( (char) (aCharAscII + 1));
                System.out.println(sb);
            }else if (aCharAscII == 90){
                System.out.println("YZA");
            }else {
                sb.append((char) (aCharAscII - 1));
                sb.append(aChar);
                sb.append((char) (aCharAscII + 1));
                System.out.println(sb);
            }
        }else {
            if (aCharAscII == 97){
                sb.append("z");
                sb.append(aChar);
                sb.append((char) (aCharAscII + 1));
                System.out.println(sb);
            }else if (aCharAscII == 122){
                System.out.println("yza");
            }else {
                sb.append((char) (aCharAscII - 1));
                sb.append(aChar);
                sb.append((char) (aCharAscII + 1));
                System.out.println(sb);
            }
        }
    }
}
