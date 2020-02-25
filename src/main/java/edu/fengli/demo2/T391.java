package edu.fengli.demo2;


/**
 * @author Administrator
 */
public class T391 {
    public static void main(String[] args) {

        for (int i= 100; i <= 999; i ++){
            int ge = i % 10;
            int a = i / 10;
            int shi = a % 10;
            a = a / 10;
            int bai = a % 10;

            int v = (int)(Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3));
            if (v == i){
                System.out.println(i);
            }
        }
    }
}
