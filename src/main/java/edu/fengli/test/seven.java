package edu.fengli.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int number = i;
            List<Integer> list = new ArrayList<Integer>();
            while (number > 0){
                int v = number % 10;
                list.add(v);
                number /= 10;
            }
            int temp = 0;
            boolean flag = false;

            for (int j = 0; j < list.size() - 1; j++) {
                temp = list.get(j);
                flag = temp >= list.get(j + 1);
            }

            if (flag || list.size() == 1){
                count ++;
            }
        }
        System.out.println(count);
    }
}
