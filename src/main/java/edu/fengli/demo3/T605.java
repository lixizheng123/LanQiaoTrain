package edu.fengli.demo3;

import java.util.Scanner;

public class T605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int nextInt = scanner.nextInt();
        int[] ints = changeIntArr(s);
        System.out.println(er(ints, nextInt, 0, ints.length - 1));
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }

    public static int er(int[] ints, int k, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if (ints[mid] == k){
            return mid;
        }else if(ints[mid] > k){
            return er (ints, k,start,mid-1);
        }else {
            return er(ints, k,mid+1,end);
        }
    }
}
