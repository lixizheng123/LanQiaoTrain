package edu.fengli.demo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lixizheng
 */
public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 数列长度
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        String[] arrStr = s.split(" ");
        int[] arrInt = changeIntArr(arrStr);
        // 询问个数
        int c = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ;i < c ;i++){
            String[] arrS = scanner.nextLine().split(" ");
            int start = Integer.parseInt(arrS[0]);
            int end = Integer.parseInt(arrS[1]);
            int maxCount = Integer.parseInt(arrS[2]);
            int pares = pares(maxCount, start, end, arrInt);
            System.out.println(pares);
        }
    }

    /**
     * 将String数组转int数组
     * @param strings
     * @return
     */
    public static int[] changeIntArr(String[] strings){
        int [] arr = new int[strings.length];
        for (int i = 0;i < strings.length ;i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        return arr;
    }


    public static int pares(int maxCount,int start, int end, int[] arr){
        int count = 0;

        if (start == end){
            return (Math.max(arr[start-1], arr[end-1]));
        }else {
            start = start - 1;
            int[] endArr = new int[end - start];
            for (int i = start; i < end; i++) {
                endArr[count] = arr[i];
                count++;
            }
            Arrays.sort(endArr);
            return endArr[endArr.length - maxCount];
        }
    }
}
