package edu.fengli.demo2;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Administrator
 */
public class T278 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        Arrays.sort(ints);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(length);
        for (int anInt : ints) {
            Integer integer = map.get(anInt);
            if (integer == null) {
                map.put(anInt, 1);
            } else {
                map.put(anInt, integer + 1);
            }
        }
        for (Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
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
