package edu.fengli.demo1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i,j;
        //进位
        int jw = 0;
        //存放中间结果
        int temp;
        //4000位
        int max = 4000;
        int[] a = new int[max];
        a[0] = 1;

        for(i = 2; i <= n; i ++) {
            for(j = 0; j < max; j++) {
                temp = a[j] * i + jw;
                jw = temp / 10;
                a[j] = temp % 10;
            }
        }

        //找出前置0和结果之间的界限
        for(i = max-1;i >= 0;i --){
            if(a[i] != 0) {
                break;
            }
        }

        //倒序输出
        for(j = i;j >= 0;j --) {
            System.out.print(a[j]);
        }
    }
}
