package edu.fengli.demo2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            double a = scanner.nextDouble();
            double sum = 0;
            int count;
            if (Double.toString(a).equals(0.00 + "")) {
                break;
            }

            for (int i = 2;; i++) {
                sum += (1.00 / i);
                if (sum >= a){
                    count= i - 1;
                    break;
                }
            }
            System.out.println(count + " card(s)");
        }
    }
}
