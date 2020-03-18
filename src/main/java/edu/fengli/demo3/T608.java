package edu.fengli.demo3;

import java.util.Scanner;

public class T608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        double[] ints = changeDoubleArr(s);
        double avg = avg(ints);
        int result = 0;
        for (double i : ints) {
            if (i >= avg){
                result ++;
            }
        }
        System.out.println(result);
    }
    public static double[] changeDoubleArr(String[] strings){
        double[] doubles = new double[strings.length];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }
        return doubles;
    }
    public static double avg(double[] arr){
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
