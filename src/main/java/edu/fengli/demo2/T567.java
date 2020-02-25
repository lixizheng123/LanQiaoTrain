package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] s = nextLine.split(" ");
        int[] ints = changeIntArr(s);
        int[] swap = swap(ints);
        for (int i : swap) {
            if (i != 0){
                System.out.print(i + " ");
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
    public static int[] swap(int[] ints){
        int[] endArr = new int[ints.length];
        int index = 0;
        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] == 0){
            }else {
                endArr[index] = ints[i];
                index ++;
            }
        }
        return endArr;
    }
}
