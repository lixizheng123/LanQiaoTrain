package edu.fengli.test1;

public class 立方尾不变 {
    public static void main(String[] args) {
        int count= 0;
        for (long i = 1; i <= 10000; i++) {
            if (i < 10){
                if (i * i * i % 10 == i) {count ++;}
            }else if (i < 100){
                if (i * i * i % 100 == i){count ++;}
            }else if (i < 1000){
                if (i * i * i % 1000 == i) {
                    count ++;
                }
            }else if (i < 10000){
                if (i * i * i % 10000 == i){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
