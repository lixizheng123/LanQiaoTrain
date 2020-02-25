package edu.fengli.demo2;



import java.util.Scanner;

/**
 * @author Administrator
 */
public class T334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        int length = nextLine.length();
        int i = Integer.parseInt(nextLine);

        int number = 0;
        for (int j = 0; j < nextLine.length(); j++) {
            int n = Integer.parseInt(nextLine.charAt(j) + "");
            double pow = Math.pow(n, length);
            number += pow;
        }

        if (number == i){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
