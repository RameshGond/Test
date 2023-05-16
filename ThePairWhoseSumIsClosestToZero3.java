package test;

import java.util.Arrays;

public class ThePairWhoseSumIsClosestToZero3 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7, 8, -20, 40, 6 };
        findClosestPairToZero(array);
    }

    public static void findClosestPairToZero(int[] array) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int pair1 = 0;
        int pair2 = 0;

        while (left < right) {
            int sum = array[left] + array[right];
            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                pair1 = array[left];
                pair2 = array[right];
            }

            if (sum > 2)
                left++;
            else if (sum < 0)
                right--;
            else
                break;
        }

        System.out.println("The pair whose sum is closest to zero: " + pair1 + " and " + pair2);
    }
}
