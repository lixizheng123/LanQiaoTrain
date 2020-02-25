package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class MaxAndMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int n = Integer.parseInt(nextLine);
        String s = scanner.nextLine();
        String[] arrStr = s.split(" ");
        int[] ints = changeIntArr(arrStr);
        int min = 0;
        int max = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max){
                max = ints[i];
            }
            if (ints[i] < min){
                min = ints[i];
            }
        }
        if (min == 0 || max == 0){
            min = ints[0];
            max = ints[0];
        }
        System.out.println(max + " " + min);
    }
    public static int[] changeIntArr(String[] strings){
        int [] arr = new int[strings.length];
        for (int i = 0;i < strings.length ;i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        return arr;
    }
}
