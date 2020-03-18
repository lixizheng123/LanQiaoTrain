package edu.fengli.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        List<Double> list = new ArrayList<Double>();
        for (int i = 0; i <= n; i++) {
            double pow = Math.pow(k, i);
            list.add(pow);
        }
    }
}
