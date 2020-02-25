package edu.fengli.demo3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T454 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] s = nextLine.split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String[] stringNumbers = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(stringNumbers);

        int count = 0;
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++){
                boolean b = (ints[i] - ints[j]) == k;
                System.out.println((ints[i] - ints[j]));
                if (b){
                    count++;
                }
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
