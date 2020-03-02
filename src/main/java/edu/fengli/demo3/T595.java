package edu.fengli.demo3;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Administrator
 */
public class T595 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        bash(nextInt);
    }

    public static void bash(int n){
        Stack<Integer> stack = new Stack<Integer>();

        while (n > 0){
            stack.push(n % 8);
            n /= 8;
        }
        System.out.print("0");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
