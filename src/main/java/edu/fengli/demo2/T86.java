package edu.fengli.demo2;

/**
 * @author Administrator
 */
public class T86 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9999 ; i++) {
            if (get(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean get(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && number != i){
                count += i;
            }
        }
        return count == number;
    }
}
