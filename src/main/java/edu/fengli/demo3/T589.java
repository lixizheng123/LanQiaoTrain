package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T589 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        int max = Integer.MIN_VALUE;
        for (int anInt : ints) {
            if (anInt > max) {
                max = anInt;
            }
        }
        System.out.println(max);
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
