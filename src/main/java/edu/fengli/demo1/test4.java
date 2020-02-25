package edu.fengli.demo1;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int n = Integer.parseInt(s1);
        String[] s = s2.split(" ");
        List<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i< s.length ; i++){
            list.add(Integer.parseInt(s[i]));
        }

        int huffman = huffman(list);
        System.out.println(huffman);
    }

    public static int huffman(List<Integer> list){
        if (list.size() != 1) {
            Integer min1 = getMinNumber(list);
            Integer min2 = getMinNumber(list);
            list.add(min1 + min2);
            return huffman(list) + (min1 + min2);
        }else {
            return 0;
        }
    }

    public static Integer getMinNumber(List<Integer> list){
        Collections.sort(list);
        Integer integer = list.get(0);
        list.remove(integer);
        return integer;
    }
}
