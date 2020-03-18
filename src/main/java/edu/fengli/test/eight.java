package edu.fengli.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        List<String> list = new ArrayList<String>();
        int temp = n;
        while (temp > 0){
            list.add(scanner.nextLine());
            temp --;
        }
        int k = scanner.nextInt();
        scanner.close();

        char[][] arr = new char[4][5];

        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            for (int j = 0; j < s1.length(); j++) {
                arr[i][j] = s1.charAt(j);
            }
        }

        for (char[] h : arr) {
            for (char c : h){
                System.out.print(c);
            }
            System.out.println();
        }

        for (int i = 0; i < k; i++) {
            arr = jia(arr, n, m);
        }

        for (char[] h : arr) {
            for (char c : h){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static char[][] jia(char[][] arr, int n, int m){
        char[][] newArr = new char[n][m];

        for(int i = 0; i < arr.length ; i++){
            System.arraycopy(arr[i], 0, newArr[i], 0, arr[i].length);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'g'){
                    // 左右加草
                    if ((j - 1) >= 0) {
                        newArr[i][j - 1] = 'g';
                    }
                    if ((j + 1) < m){
                        newArr[i][j + 1] = 'g';
                    }

                    // 上下加草
                    if ((i + 1) < n) {
                        newArr[i + 1][j] = 'g';
                    }
                    if ((i - 1) >= 0){
                        newArr[i - 1][j] = 'g';
                    }
                }
            }
        }

        return newArr;
    }
}
