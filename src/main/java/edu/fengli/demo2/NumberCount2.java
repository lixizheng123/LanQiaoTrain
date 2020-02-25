package edu.fengli.demo2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class NumberCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (int i = 0;i < n;i++){
            String nextLine = scanner.nextLine();
            if (map.get(nextLine) == null){
                map.put(nextLine, 1);
            }else {
                map.put(nextLine, map.get(nextLine) + 1);
            }
        }
        int maxVal = 0;
        String maxKey = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxVal){
                maxVal = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);
    }
}
