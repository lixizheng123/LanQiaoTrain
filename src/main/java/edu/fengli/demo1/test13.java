package edu.fengli.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() == 1){
            System.out.println(s);
        }else {
            char[] chars = s.toCharArray();
            int count = 0;
            List<Integer> listIndex = new ArrayList<Integer>();
            List<Character> listNumber = new ArrayList<Character>();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 != 0) {
                    listIndex.add(i);
                    listNumber.add(chars[i]);
                }
            }
            int endCount = listNumber.size() - 1;
            for (int i = 0; i < chars.length; i++) {
                int index = 0;
                if (count < listNumber.size()) {
                    index = listIndex.get(count);
                }
                if (i == index) {
                    chars[i] = listNumber.get(endCount--);

                    count++;
                }
            }
            for (char c : chars) {
                System.out.print(c);
            }
        }
    }
}
