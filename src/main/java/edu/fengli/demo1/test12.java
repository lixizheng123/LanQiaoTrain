package edu.fengli.demo1;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        int maxIndex = 0;
        int max = 0;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] > max){
                max = ints[i];
                maxIndex = i;
            }
        }

        System.out.println(max + " " + maxIndex);

    }
    public static int[] changeIntArr(String[] strings){
        int [] arr = new int[strings.length];
        for (int i = 0;i < strings.length ;i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        return arr;
    }
}
