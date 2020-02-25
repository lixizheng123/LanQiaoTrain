package edu.fengli.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userYear = scanner.nextInt();
        boolean leapYear = isLeapYear(userYear);
        Map<Integer, Integer> map = getMap(leapYear);
        int parse = parse(map);
        System.out.println(parse);
    }

    /**
     * 闰年判断
     * @param year 年份
     * @return true/false
     */
    public static boolean isLeapYear(int year){
        boolean b1 = year % 4 == 0 && year % 100 != 0;
        boolean b2 = year % 100 == 0 && year % 400 == 0;

        return b1 || b2;
    }

    /**
     * 获取存储 12个月天数的map
     * @param b 是否是闰年
     * @return
     */
    public static Map<Integer,Integer> getMap(boolean b){
        // 闰年 2月29天，平年28天
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(1,31);
        if (b){
            map.put(2,29);
        }else {
            map.put(2,28);
        }
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);


        return map;
    }

    public static int parse(Map<Integer, Integer> map){
        int count = 0;
        int n = 0;
        for (int i = 1; i <= 12; i++) {
            Integer days = map.get(i);
            for (int j = 1; j <= days; j++) {
                if (i == 1 && j == 1){
                    n += 1;
                }
                if (j == 13 && ((n - 2) % 7 == 0)){
                    System.out.println(i + ":" + j);
                   count ++;
                }

                n += 1;
            }
        }

        return count;
    }
}
