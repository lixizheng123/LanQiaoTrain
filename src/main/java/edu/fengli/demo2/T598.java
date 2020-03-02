package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T598 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        double[] doubles = changeDoubleArr(s);
        double sum = 0;
        for (double d : doubles) {
            sum += d;
        }
        System.out.println((int)sum);
        System.out.println(sum / (doubles.length));
    }
    public static double[] changeDoubleArr(String[] strings){
        double[] doubles = new double[strings.length];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }
        return doubles;
    }
}
