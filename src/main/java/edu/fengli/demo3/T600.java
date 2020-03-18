package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T600 {
    public static void main(String[] args) {
        System.out.println(getNumber(10, 1));
    }

    private static int getNumber(int day, int sum) {
        if (day == 1){
            return sum;
        }else {
            sum = (sum + 1) * 2;
            return getNumber(day - 1, sum);
        }
    }
}
