package edu.fengli.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;
        int[] arr = new int[n + 1];
        while (count < n){
            int nextInt = scanner.nextInt();
            arr[count] = nextInt;
            count ++;
        }

        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    boolean indexFlag = i < j && j < k && k < n + 1;
                    boolean numberFlag = (arr[i] < arr[j]) && (arr[j] < arr[k]);
                    if (indexFlag && numberFlag){
                        result ++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
