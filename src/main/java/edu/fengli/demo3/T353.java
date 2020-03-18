package edu.fengli.demo3;


import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 */
public class T353 {
    public static void main(String[] args) {
        for (int m = 1; m < 10000; m++) {
            String s = "";
            for (int n = 1; n <= 50; n++) {
                s = m * n + "" + (m * (n + 1)) + "" + (m * (n + 2));
                boolean parse = parse(s);
                if (parse && s.length() == 9){
                    System.out.println(s);
                }
            }
        }
    }

    private static boolean parse(String s) {
        Set<Character> set = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            boolean b = c == '1' || c == '2' || c == '3' ||
                    c == '4' || c == '5' || c == '6' ||
                    c == '7' || c == '8' || c == '9';
            if (b){
                set.add(c);
            }
        }

        return set.size() == s.length() && s.length() == 9;
    }
}
