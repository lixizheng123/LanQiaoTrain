package edu.fengli.demo2;

/**
 * @author Administrator
 */
public class T338 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            boolean b = sumNumber(i) == 10;
            if (b){
                System.out.println(i);
            }
        }
    }
    public static int sumNumber(int n){
        String s = n + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int parseInt = Integer.parseInt(s.charAt(i) + "");
            sum += parseInt;
        }
        return sum;
    }
}
