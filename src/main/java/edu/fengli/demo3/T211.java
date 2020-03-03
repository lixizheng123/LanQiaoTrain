package edu.fengli.demo3;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        Arrays.sort(ints);
        System.out.println(ints[ints.length - 2]);
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length - 1];
        for (int i = 0; i < ints.length; i++) {
            if (!"0".equals(strings[i])) {
                ints[i] = Integer.parseInt(strings[i]);
            }
        }
        return ints;
    }
}
