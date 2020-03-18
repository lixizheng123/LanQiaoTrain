package edu.fengli.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T587 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int l = Integer.parseInt(s[1]);
        if (h == 1 || l == 1){
            if (h == 1) {
                while (l > 0) {
                    System.out.println(scanner.nextInt());
                    l--;
                }
            }else {
                while (h > 0) {
                    System.out.print(scanner.nextInt() + " ");
                    h--;
                }
            }
        }else {
            List<String> list = new ArrayList<String>();
            while (h > 0) {
                String nextLine = scanner.nextLine();
                list.add(nextLine);
                h--;
            }

            int size = list.size();
            int index = 0;
            for (int i = 0; i < l; i++) {
                while (index < size) {
                    if (list.get(index).length() > 1) {
                        System.out.print(list.get(index).split(" ")[i] + " ");
                    }
                    index++;
                }
                index = 0;
                System.out.println();
            }
        }
    }
}
