package edu.fengli.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        System.out.println(listToString(delPack(nextLine)));
    }
    static List<Character> list = new ArrayList<Character>();

    public static List<Character> delPack(String str){
        char[] chars = str.toCharArray();
        List<Character> rs = new ArrayList<Character>();

        for (Character aChar : chars) {
            if (!list.contains(aChar)){
                rs.add(aChar);
                list.add(aChar);
            }else {
                rs.remove(aChar);
            }
        }
        return rs;
    }
    public static String listToString(List<Character> list){
        StringBuilder sb = new StringBuilder();
        for (Character character : list) {
            sb.append(character);
        }
        return sb.toString();
    }
}
