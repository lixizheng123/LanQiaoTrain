package edu.fengli.demo2;

import java.util.*;

/**
 * @author Administrator
 */
public class T271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        Set<Integer> set = new TreeSet<Integer>(new MyComparator());
        for (int anInt : ints) {
            set.add(anInt);
        }
        System.out.println(set.size());
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }

    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
