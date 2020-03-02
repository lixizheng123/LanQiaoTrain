package edu.fengli.demo3;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Administrator
 */
public class T594 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        di(nextInt);
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    public static Stack<String> stack = new Stack<String>();
    public static int di(int n){
        if ((n / 10) == 0){
            stack.push("-");
            stack.push(n % 10 + "");
            return 0;
        }else {
            stack.push("-");
            stack.push(n % 10 + "");
            return di(n / 10);
        }
    }
}
