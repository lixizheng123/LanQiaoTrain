package edu.fengli.demo4;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T454 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);

        int count = 0;
        int number = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                int cha = Math.abs(ints[i] - ints[j]);
                if (cha == k){
                    number ++;
                }
            }
            if (number != 0){
                count ++;
                number = 0;
            }
        }
        System.out.println(count);
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
