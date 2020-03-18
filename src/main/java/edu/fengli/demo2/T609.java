package edu.fengli.demo2;

import java.util.Scanner;

public class T609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        int c1 = 0;
        int c2 = 0;

        for (int i : ints) {
            if (i < 0){
                c2 ++;
            }else {
                c1 ++;
            }
        }

        System.out.println(c1);
        System.out.println(c2);
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
