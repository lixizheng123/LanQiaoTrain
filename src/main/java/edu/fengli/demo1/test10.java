package edu.fengli.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().charAt(0) + "");
        String[] s = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            int number = Integer.parseInt(s[i]);
            if (number != 0){
                list.add(number);
            }
        }

        System.out.println(list.size());
        for (Integer integer : list){
            System.out.print(integer + " ");
        }
    }
}
