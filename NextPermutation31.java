package com.practice.array;

import com.practice.tags.difficulty.Medium;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.StriverSheetArrays;

public class NextPermutation31 implements Medium, StriverSheetArrays, Creek300 {
    public static void main(String[] args) {
        NextPermutation31 obj = new NextPermutation31();
        int[] nums1 = {1, 2, 3};
        int[] nums = {3, 2, 1};
        obj.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public void nextPermutation(int[] nums) {
        int breakPointIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPointIndex = i;
                break;
            }
        }

        if (breakPointIndex == -1) {
            reverseArray(nums, 0, nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i > breakPointIndex; i--) {
            if (nums[i] > nums[breakPointIndex]) {
                int temp = nums[breakPointIndex];
                nums[breakPointIndex] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverseArray(nums, breakPointIndex + 1, nums.length - 1);
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
