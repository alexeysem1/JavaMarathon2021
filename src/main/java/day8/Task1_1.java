package day8;
import java.util.Arrays;

public class Task1_1 {
    public static void main(String[] args) {
        int[] x = new int[20001];
        String intArrayString = null;
        for (int i = 0; i <= 20000; i++) {
            x[i] = i;
            intArrayString = Arrays.toString(x);
        }
        System.out.println(intArrayString);

    }
}
