package test;

import java.util.Arrays;

public class ThePairWhoseSumIsClosestToZero1 {
    public static void findPairWithClosestToZero(int[] arr) {
        if (arr == null || arr.length < 2) {
        }

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int leftNum = 0;
        int rightNum = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                leftNum = arr[left];
                rightNum = arr[right];
            }
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.println("The pair whose sum is closest to zero: " + leftNum + " and " + rightNum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -5, 7, 8, 20, -40, 6 };
        findPairWithClosestToZero(arr);
    }
}
