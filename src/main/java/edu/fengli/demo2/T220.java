package edu.fengli.demo2;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Administrator
 */
public class T220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.nextLine());
        String nextLine = scanner.nextLine();
//        Map<String, Integer> map = new HashMap<String, Integer>();
        Demo demo = new Demo(nextLine.length() * 2);
        for (int i = 0; i < nextLine.length(); i++) {
            int l1 = i + l;
            if (l1 <= nextLine.length()){
                String substring = nextLine.substring(i, l1);
                StringKV kv = new StringKV();
                kv.setKey(substring);
                boolean empty = demo.isEmpty(kv);
                if (!empty){
                    kv.setInteger(1);
                    demo.add(kv);
                }else {
                    StringKV stringKV = demo.getInteger(kv);
                    stringKV.setInteger(stringKV.getInteger() + 1);
                    demo.add(stringKV);
                }
//                if (map.get(substring) == null){
//                    map.put(substring, 1);
//                }else {
//                    map.put(substring, map.get(substring) + 1);
//                }
            }
        }
        for (int i = nextLine.length() - 1; i >= 0; i--) {
            int l1 = i - l;
            if (l1 >= 0) {
                String substring = nextLine.substring(l1 + 1, i + 1);
//                if (map.get(substring) == null) {
//                    map.put(substring, 1);
//                } else {
//                    map.put(substring, map.get(substring) + 1);
//                }
                StringKV kv = new StringKV();
                kv.setKey(substring);
                boolean empty = demo.isEmpty(kv);
                if (!empty){
                    kv.setInteger(1);
                    demo.add(kv);
                }else {
                    StringKV stringKV = demo.getInteger(kv);
                    stringKV.setInteger(stringKV.getInteger() + 1);
                    demo.add(stringKV);
                }
            }
        }
//        String str = "";
//        int max = 0;
//        for (Entry<String, Integer> entry: map.entrySet()) {
//            if (max < entry.getValue()){
//                max = entry.getValue();
//                str = entry.getKey();
//            }
//        }
//        System.out.println(str);
        StringKV[] arr = demo.getArr();
        System.out.println(Arrays.toString(arr));
        String str = "";
        int count = 0;
        for (StringKV kv : arr) {
            if (kv != null) {
                Integer integer = kv.getInteger();
                if (integer != null && count < integer) {
                    count = integer;
                    str = kv.getKey();
                }
            }
        }
        System.out.println(str);
    }
}
class Demo{
    private StringKV[] arr ;
    private int index;

    public Demo(int length){
        arr = new StringKV[length];
    }
    public void add(StringKV stringKV){
        arr[index ++] = stringKV;
    }
    public StringKV[] getArr() {
        return arr;
    }
    public boolean isEmpty(StringKV stringKV){
        if (arr == null){
            return false;
        }
        for (StringKV s : arr) {
            if (s != null) {
                return s.getKey().equals(stringKV.getKey());
            }
        }
        return false;
    }
    public StringKV getInteger(StringKV stringKV){
        if (arr == null){
            return null;
        }
        for (StringKV s : arr) {
            if (s != null) {
                boolean equals = s.getKey().equals(stringKV.getKey());
                if (equals){
                    return s;
                }
            }
        }
        return null;
    }
}
class StringKV{
    private String key;
    private Integer integer;

    public StringKV(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "StringKV{" +
                "key='" + key + '\'' +
                ", integer=" + integer +
                '}';
    }
}