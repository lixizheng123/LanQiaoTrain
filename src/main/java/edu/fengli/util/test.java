package edu.fengli.util;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        for (int i = 9999; i >= 1000; i--) {
            for (int j = 1000; j <= 9999 ; j++) {
                if ((i - j) == 2016){
                    boolean parse = parse(i, j);
                    if (parse) {
                        System.out.println(i + "-" + j + "=" + (i - j));
                    }
                }
            }
        }
    }

    private static boolean parse(int i, int j) {
        String s1 = i + "";
        String s2 = j + "";

        if (s1.contains("0") || s2.contains("0")){
            return false;
        }
        boolean flag = false;
        Set<Character> set = new HashSet<Character>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        for (char c : s2.toCharArray()) {
            set.add(c);
        }
        if (set.size() == 8){
            flag = true;
        }
        return flag;
    }
}
