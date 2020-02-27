package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        if (!nextLine.contains(".")) {
            int nextInt = Integer.parseInt(nextLine);
            if (nextInt >= 90 && nextInt <= 100){
                System.out.println("A");
            }else if (nextInt >= 80 && nextInt < 90){
                System.out.println("B");
            }else if (nextInt >= 70 && nextInt < 80){
                System.out.println("C");
            }else if (nextInt >= 60 && nextInt < 70){
                System.out.println("D");
            }else if (nextInt <= 59 && nextInt >= 0){
                System.out.println("E");
            }
        }else {
            double nextDouble = Double.parseDouble(nextLine);
            if (nextDouble >= 90 && nextDouble <= 100){
                System.out.println("A");
            }else if (nextDouble >= 80 && nextDouble < 90){
                System.out.println("B");
            }else if (nextDouble >= 70 && nextDouble < 80){
                System.out.println("C");
            }else if (nextDouble >= 60 && nextDouble < 70){
                System.out.println("D");
            }else if (nextDouble <= 59 && nextDouble >= 0){
                System.out.println("E");
            }
        }
    }
}
