package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T332 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean b = (i % 5 == 0) || (i % 3 == 0);
            if (b){
                count += i;
            }
        }
        System.out.println(count);
    }
}
