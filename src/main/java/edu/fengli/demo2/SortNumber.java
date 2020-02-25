package edu.fengli.demo2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class SortNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] s = nextLine.split(" ");
        int[] ints = changeIntArr(s);
        Arrays.sort(ints);
        for (int i = ints.length - 1; i >= 0 ; i--) {
            System.out.print(ints[i] + " ");
        }
    }
    /**
     * 将String数组转int数组
     * @param strings
     * @return
     */
    public static int[] changeIntArr(String[] strings){
        int [] arr = new int[strings.length];
        for (int i = 0;i < strings.length ;i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        return arr;
    }
}
