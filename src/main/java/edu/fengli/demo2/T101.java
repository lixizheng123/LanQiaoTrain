package edu.fengli.demo2;

import java.util.*;

/**
 * @author Administrator
 */
public class T101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        List<Integer> list = new ArrayList<Integer>();
        for (int anInt : ints) {
            if (!list.contains(anInt)) {
                list.add(anInt);
            }
        }
        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i);
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
