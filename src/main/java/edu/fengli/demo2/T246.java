package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] strings = nextLine.split(" ");

        int min = Integer.parseInt(strings[0]);
        int max = Integer.parseInt(strings[1]);
        int factor = Integer.parseInt(strings[2]);

        for (int i = min; i <= max; i++){
            if (i % factor == 0){
                System.out.print(i + " ");
            }
        }
    }
}
