package edu.fengli.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T295 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        List<Integer> list1 = getIntArr(a);
        List<Integer> list2 = getIntArr(b);

        int sum1 = sum(list1);
        int sum2 = sum(list2);

        if (sum1 == b && sum2 == a){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
    public static List<Integer> getIntArr(int number){
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && number != i){
                list.add(i);
            }
        }
        return list;
    }

    public static int sum(List<Integer> list){
        Integer sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }
}
