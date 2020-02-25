package edu.fengli.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int d1 = 0;
        int e1 = 0;
        while (list.size() > 0){
            boolean one = list.get(0) >= 2 && list.get(1) >= 1 && list.get(3) >= 2;
            boolean two = list.get(0) >= 1 && list.get(1) >= 1 && list.get(2) >= 1 && list.get(3) >= 1;
            boolean three = list.get(2) >= 2 && list.get(3) >= 1;
            boolean four = list.get(1) >= 3;
            boolean five = list.get(0) >= 1 && list.get(3) >= 1;
            if (one){
                list.set(0,list.get(0) - 2);
                list.set(1,list.get(1) - 1);
                list.set(3,list.get(3) - 2);
                a1 ++;
            }else if (two){
                list.set(0,list.get(0) - 1);
                list.set(1,list.get(1) - 1);
                list.set(2,list.get(2) - 1);
                list.set(3,list.get(3) - 1);
                b1 += 1;
            }else if (three){
                list.set(2,list.get(2) - 2);
                list.set(3,list.get(3) - 1);
                c1 += 1;
            }else if (four){
                list.set(1,list.get(1) - 3);
                d1 += 1;
            }else if (five){
                list.set(0,list.get(0) - 1);
                list.set(3,list.get(3) - 1);
                e1 += 1;
            }

            if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0 && list.get(3) == 0){
                break;
            }
        }

        System.out.println(a1);
        System.out.println(c1);
        System.out.println(b1);
        System.out.println(d1);
        System.out.println(e1);
    }
}
