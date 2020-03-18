package edu.fengli.util;

public class TestTryCatch {
    public static void main(String[] args) {
        try {
            int i = 1 + 1;
            throw new RuntimeException("try hahaha");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("catch hahaha");
        }
        System.out.println("hahahah");
    }
}
