package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(strings);
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int anInt : ints) {
            if (min > anInt) {
                min = anInt;
            }
            if (max < anInt) {
                max = anInt;
            }
        }
        System.out.println(max + " " + min);
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
