package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T245 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int t = Integer.parseInt(s[0]);
        double m = Double.parseDouble(s[1]);
        scanner.close();

        if (t <= 40){
            double end = t * m;
            System.out.printf("%.2f", end);
        }else if (t <= 50){
            double ch = (t - 40) * (1.5 * m);
            double end = 40 * m;
            double v = ch + end;
            System.out.printf("%.2f", v);

        }else {
            double ch1 = (t - 50) * (2 * m);
            double ch2 = 10 * (1.5 * m);
            double end = 40 * m;
            double v = ch1 + ch2 + end;
            System.out.printf("%.2f", v);
        }
    }
}
