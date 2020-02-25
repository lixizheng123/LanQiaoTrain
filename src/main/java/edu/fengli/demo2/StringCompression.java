package edu.fengli.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        char[] chars = nextLine.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length ;i++){
            if (map.get(chars[i]) == null){
                map.put(chars[i], 1);
                sb.append(chars[i]);
            }else {
                map.put(chars[i], map.get(chars[i]) + 1);

                if (map.get(chars[i]) % 2 == 0 && chars[i] != ' '){
                }else if (map.get(chars[i]) == 3){
                    sb.append(chars[i]);
                }else {
                    sb.append(chars[i]);
                }
            }
        }

        System.out.println(sb);
    }
}
