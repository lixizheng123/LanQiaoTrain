package edu.fengli.demo2;

import com.sun.org.apache.bcel.internal.generic.INEG;

import java.util.*;

/**
 * @author Administrator
 */
public class NumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        String[] arrStr = s.split(" ");
        int max = 0;
        String maxString = "";
        Set<String> set = new HashSet<String>();
        int[] arr = new int[n];

        for (int i = 0 ; i < arrStr.length; i++){
            if (!set.contains(arrStr[i])){
                set.add(arrStr[i]);
                arr[i] += 1;
            }else{

            }
        }
    }
}
