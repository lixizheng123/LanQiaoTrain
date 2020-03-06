package edu.fengli.demo3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] != 0){
                System.out.print(ints[i] + " ");
            }
        }
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
