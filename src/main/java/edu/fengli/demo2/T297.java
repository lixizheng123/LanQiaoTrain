package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T297  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();

        printResult1(nextLine);
    }

    public static void printResult1(String A) {
        char[] arrayA = A.toCharArray();
        int max = arrayA.length;
        for(int i = 0;i < arrayA.length;i++) {
            int k = i + 1;
            if(k > arrayA.length / 2) {
                break;
            } else if(arrayA.length % k != 0) {
                continue;
            }
            int j = k;
            for(;j < arrayA.length;j++) {
                if(arrayA[j] != arrayA[j % k]) {
                    break;
                }
            }
            if(j == arrayA.length) {
                max = k;
                break;
            }
        }
        System.out.println(max);
    }
}
