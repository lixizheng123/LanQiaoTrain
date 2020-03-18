package edu.fengli.test;

/**
 * @author Administrator
 */
public class three {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2019; i++) {
            String s = i + "";
            if (s.contains("9")){
                count ++;
            }
        }
        System.out.println(count);
    }
}
