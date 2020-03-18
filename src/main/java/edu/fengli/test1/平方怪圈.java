package edu.fengli.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class 平方怪圈 {
    public static void main(String[] args) {
        int start = 3;
        int count = 0;
        int max = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (count < 1000){

            int[] arr = get(start);
            int sum = 0;
            for (int i : arr) {
                sum += (i * i);
            }
            start = sum;
            if (max < sum){
                max = sum;
            }
            count ++;
        }
        System.out.println(max);
    }

    private static int[] get(int count) {
        String s = count + "";
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(s.charAt(i) + "");
        }
        return arr;
    }
}
