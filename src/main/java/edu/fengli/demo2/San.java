package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class San {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();

        for (int i = 0; i < nextInt ;i++){
            for (int j = i + 1; j < nextInt; j++){
                System.out.print(" ");
            }
            if (i == 0) {
                print(i + 1);
            }else {
                print( i + 1);
                print( i );
            }
            System.out.println();
        }
    }

    public static void print(int i){
        for (int ii = 0; ii < i ;ii++){
            System.out.print("*");
        }
    }
}
