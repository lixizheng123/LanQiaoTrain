package edu.fengli.demo1;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class test1 {

    private static final int MAX = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextOne = scanner.nextLine();
        String nextTwo = scanner.nextLine();

        int[] arr1 = new int[MAX];
        int[] arr2 = new int[MAX];
        int jw = 0;
        int[] endArr = new int[MAX + 2];

        for (int i = 0 ;i < nextOne.length();i++){
            arr1[i] = nextOne.charAt(nextOne.length() - 1 - i) - 48;
        }
        for (int i = 0 ;i < nextTwo.length();i++){
            arr2[i] = nextTwo.charAt(nextTwo.length() - 1 - i) - 48;
        }


        for (int i = 0; i< MAX; i++){
            int temp = arr1[i] + arr2[i] + jw;
            endArr[i] = temp % 10;
            jw = temp / 10;
        }

        boolean begin = false;
        //判断高位是否为0，为0不输出，不为0输出所有
        for(int i = endArr.length - 1; i >= 0; i--) {
            if(begin) {
                System.out.print(endArr[i]);
                continue;
            }
            if(endArr[i - 1] != 0) {
                begin = true;
            }
        }
    }
}
