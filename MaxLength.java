package test;

import java.util.Arrays;

public class MaxLength {
    public static int findFourthMax(int[] arr) {
        if (arr == null || arr.length < 4) {
        }
        Arrays.sort(arr);
        return arr[arr.length - 4];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 4, 6, 3, 7, 8, 5 };
        int fourthMax = findFourthMax(arr);
        System.out.println("Fourth maximum element: " + fourthMax);
    }

}
