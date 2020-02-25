package edu.fengli.demo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class HighPrecisionSum {

    private static final int MAX = 100;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[MAX];
        int[] B = new int[MAX];
        int[] C = new int[102];
        // 进位
        int carry = 0;
        boolean begin = false;
        String a = in.nextLine();
        String b = in.nextLine();
        for(int i = 0; i < A.length; i++) {
            A[i] = 0;
            B[i] = 0;
            C[i] = 0;
        }
        // String转为int
        for(int i = 0; i < a.length(); i++) {
            A[i] = a.charAt(a.length() - 1 - i) - 48;
        }
        // String转为int
        for(int i = 0; i < b.length(); i++) {
            B[i] = b.charAt(b.length() - 1 - i) - 48;
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        // 求和
        for(int i = 0; i < MAX; i++) {
            int temp = A[i] + B[i] + carry;
            // A[i]和 B[i]相加的个位放在C [i]
            C[i] = temp % 10;
            // A[i]和 B[i]的进位
            carry = temp / 10;
        }
        if(carry != 0) {
            C[100] = carry;
        }
        //判断高位是否为0，为0不输出，不为0输出所有
        for(int i = C.length - 1; i >= 0; i--) {
            if(begin) {
                System.out.print(C[i]);
                continue;
            }
            if(C[i - 1] != 0) {
                begin = true;
            }
        }
    }
}