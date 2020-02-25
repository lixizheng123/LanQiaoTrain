package edu.fengli.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        String s1 = scanner.nextLine();
        String[] s2 = s1.split(" ");
        int[] arr = new int[n];
        for (int i = 0;i < n; i++){
            arr[i] = Integer.parseInt(s2[i]);
        }

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++ ){
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
