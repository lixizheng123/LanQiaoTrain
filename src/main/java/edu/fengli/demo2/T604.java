package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T604 {
    public static void main(String[] args) {
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        int a,b,c;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a % 4 == 0 && a % 100 != 0 || a % 400==0){
            arr[1] += 1;
        }
        for (int i = 0; i < b-1; i++) {
            sum += arr[i];
        }
        System.out.println(sum+c);
    }
}
