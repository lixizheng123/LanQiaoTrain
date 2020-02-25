package edu.fengli.demo1;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int x = Integer.parseInt(s1[0]);
        int y = Integer.parseInt(s1[1]);

        Swap swap = new Swap(x, y);
        swap.swap();
        System.out.println(swap.x + " " + swap.y);
    }
    public static class Swap{
        private int x;
        private int y;

        public Swap(int x, int y){
            this.x = x;
            this.y = y;
        }
        public void swap(){
            int tmep = this.x;
            this.x = this.y;
            this.y = tmep;
        }
    }
}
