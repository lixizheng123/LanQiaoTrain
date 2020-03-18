package edu.fengli.test1;

import java.util.Scanner;

public class 猜年龄 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100 ; j++) {
                int abs = Math.abs(i - j);
                if (i != j && abs <= 8){
                    if (i * j == (i + j) * 6){
                        System.out.println(Math.min(i,j));
                    }
                }
            }
        }
    }
}
