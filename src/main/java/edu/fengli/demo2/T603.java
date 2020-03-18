package edu.fengli.demo2;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int h = Integer.parseInt(strings[0]);
        int l = Integer.parseInt(strings[1]);

        while (h > 0){
            String[] split = scanner.nextLine().split(" ");
            double sumD = 0;
            int sumI = 0;
            for (int i = 0; i < split.length; i++) {
                boolean contains = split[i].contains(".");
                if (contains){
                    double v = Double.parseDouble(split[i]);
                    sumD += v;
                }else {
                    int parseInt = Integer.parseInt(split[i]);
                    sumI += parseInt;
                }
            }
            if (sumD != 0){
                System.out.println(sumD);
            }else {
                System.out.println(sumI);
            }
            h --;
        }
    }
}
