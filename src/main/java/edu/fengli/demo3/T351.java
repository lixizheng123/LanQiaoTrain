package edu.fengli.demo3;

/**
 * @author Administrator
 */
public class T351 {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                for (int c = b; c < 1000; c++) {
                    boolean b1 = a * a + b * b == c * c;
                    boolean b2 = (a + b + c) <= 1000;
                    if (b1 && b2){
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
