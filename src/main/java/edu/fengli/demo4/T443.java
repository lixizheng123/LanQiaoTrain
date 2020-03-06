package edu.fengli.demo4;

import java.util.Scanner;

/**
 * 小明正在整理一批历史文献。这些历史文献中出现了很多日期。
 *
 * 令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。
 * 更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。
 *
 *小明知道这些日期都在1960年1月1日至2059年12月31日。
 *
 * 1960-01-01 -> 2059-12-31
 * 02/03/04，2002-03-04、2004-02-03，2004-03-02
 *
 * 一个日期，格式是"AA/BB/CC"。 (0 <= A, B, C <= 9)
 *
 * @author Administrator
 */
public class T443 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        String[] split = nextLine.split("/");
        String a = split[0];
        String b = split[1];
        String c = split[2];

        int parseIntA1 = Integer.parseInt("20" + a);
        int parseIntA2 = Integer.parseInt("19" + a);
        int parseIntC1 = Integer.parseInt("20" + c);
        int parseIntC2 = Integer.parseInt("19" + c);
        boolean b1 = 1960 >= parseIntA1 && 2056 <= parseIntA1;
    }
}
