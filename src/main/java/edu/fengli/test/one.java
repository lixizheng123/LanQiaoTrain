package edu.fengli.test;

/**
 * @author Administrator
 */
public class one {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1200000; i++) {
            if (1200000  % i == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}
