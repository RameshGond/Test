package test;

import java.util.Arrays;

public class FourthMaxLength {
    public static int findFourthMax(int[] arr) {
        if (arr == null || arr.length < 4) {
        }
        Arrays.sort(arr);
        return arr[arr.length - 6];
    }

    public static void main(String[] args) {
        int[] arr = { 13, 4, 12, 4, 6, 3, 7, 8, 5 };
        int fourthMax = findFourthMax(arr);
        System.out.println("Fourth maximum element: " + fourthMax);
    }
}
