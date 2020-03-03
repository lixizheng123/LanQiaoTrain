package edu.fengli.demo3;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class T582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        int l = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        String[] s = scanner.nextLine().split(" ");
        int[] ints = changeIntArr(s);
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            // 结束位置角标
            int endIndex = i + n;
            // 存储一轮计算和
            int temp = 0;
            // 判断是否一轮中位数不足
            if (endIndex > ints.length){
                // 差位个数
                int c = n - (ints.length - i);
                // 前半段计算
                for (int j = i; j < ints.length; j++) {
                    temp += ints[j];
                }
                // 后半段计算
                for (int j = 0; j < c; j++) {
                    temp += ints[j];
                }
            }else {
                // 位数正好
                for (int j = i; j < endIndex; j++) {
                    temp += ints[j];
                }
            }
            // 取出最大值
            if (max < temp){
                max = temp;
            }
        }
        System.out.println(max);
    }
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
}
