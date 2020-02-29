package edu.fengli.demo2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] split = nextLine.split(" ");
        int length = Integer.parseInt(split[0]);
        int number = Integer.parseInt(split[1]);
        String[] strings = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(strings);
        Arrays.sort(ints);
        for (int anInt : ints) {
            boolean b = anInt % number == 0;
            if (b) {
            } else {
                boolean flag = anInt >= 'A' && anInt <= 'Z';
                if (flag) {
                    System.out.print((char) anInt + " ");
                }else {
                    System.out.print(anInt + " ");
                }
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
