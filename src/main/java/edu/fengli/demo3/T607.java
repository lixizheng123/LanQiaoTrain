package edu.fengli.demo3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intiArr = new int[10];
        int[] tempArr = new int[10];
        for (int i = 0; i < 10; i++) {
            int nextInt = scanner.nextInt();
            intiArr[i] = nextInt;
            tempArr[i] = nextInt;
        }
        Arrays.sort(tempArr);

        intiArr[0] = tempArr[tempArr.length - 1];
        intiArr[1] = tempArr[tempArr.length - 2];

        for (int i : intiArr) {
            System.out.print(i + " ");
        }
    }
}
