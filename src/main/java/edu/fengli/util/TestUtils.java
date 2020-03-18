package edu.fengli.util;

/**
 * @author Administrator
 */
public class TestUtils {
    public static int[] changeIntArr(String[] strings){
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        return ints;
    }
    public static double[] changeDoubleArr(String[] strings){
        double[] doubles = new double[strings.length];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }
        return doubles;
    }
}
