package edu.fengli.demo1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        boolean caseOne = (h > 20 && h < 60);
        boolean caseTwo = (m > 20 && m < 60);
        int oneH = 0,twoH = 0,oneM = 0,twoM = 0;
        if (m == 0){
            System.out.println(get(h) + " o'clock");
        } else if (caseOne && !caseTwo){
            String s1 = get2(Integer.parseInt((h + "").charAt(0) + "")) + " " + get(Integer.parseInt((h + "").charAt(1) + ""));
            System.out.println(s1 + " " + get(m));
        }else if (caseTwo && !caseOne){
            int i = Integer.parseInt((m + "").charAt(0) + "");
            int i1 = Integer.parseInt((m + "").charAt(1) + "");
            String s1 = get2(i) + " " + get(i1);
            System.out.println(get(h) + " " + s1);
        }else if (caseOne){
            String oneStr = get2(Integer.parseInt((h + "").charAt(0) + "")) + " " + get(Integer.parseInt((h + "").charAt(1) + ""));
            String twoStr = get2(Integer.parseInt((m + "").charAt(0) + "")) + " " + get(Integer.parseInt((m + "").charAt(1) + ""));
            System.out.println(oneStr + " " + twoStr);
        } else {
            System.out.println(get(h) + " " + get(m));
        }
    }
    public static String get2(int i){
        switch (i) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            default:
                return null;
        }
    }
    public static String get(int i){
        switch (i){
            case 0 : return "zero";
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            case 4 : return "four";
            case 5 : return "five";
            case 6 : return "six";
            case 7 : return "seven";
            case 8 : return "eight";
            case 9 : return "nine";
            case 10 : return "ten";
            case 11 : return "eleven";
            case 12 : return "twelve";
            case 13 : return "thirteen";
            case 14 : return "fourteen";
            case 15 : return "fifteen";
            case 16 : return "sixteen";
            case 17 : return "seventeen";
            case 18 : return "eighteen";
            case 19 : return "nineteen";
            case 20 : return "twenty";
            case 30 : return "thirty";
            case 40 : return "forty";
            case 50 : return "fifty";

            default:
                return null;
        }
    }

}
