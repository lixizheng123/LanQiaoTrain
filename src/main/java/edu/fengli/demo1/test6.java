package edu.fengli.demo1;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        GetTwoInts(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
    }
    public static void GetTwoInts(int x, int y){
        System.out.println(x + y);
    }
}
