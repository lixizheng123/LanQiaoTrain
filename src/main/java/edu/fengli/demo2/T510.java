package edu.fengli.demo2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class T510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split(" ");

        Map<String,Integer> map = new HashMap<String, Integer>();
        for (String str : s) {
            if (map.get(str) == null){
                map.put(str, 1);
            }else {
                map.put(str,map.get(str) + 1);
            }
        }

        int max = 0;
        String value = "";

        Iterator<Entry<String, Integer>> entries = map.entrySet().iterator();
        while(entries.hasNext()){
            Entry<String, Integer> entry = entries.next();
            if (entry.getValue() > max){
                max = entry.getValue();
                value = entry.getKey();
            }else if (entry.getValue() == max){
                int number = Integer.parseInt(value);
                int current = Integer.parseInt(entry.getKey());
                if(current < number){
                    value = entry.getKey();
                }
            }
        }

        System.out.println(value);
    }
}
