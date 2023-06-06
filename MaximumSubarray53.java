package com.practice.array;

import com.practice.tags.difficulty.Medium;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.StriverSheetArrays;

public class MaximumSubarray53 implements Medium, StriverSheetArrays, Creek300 {
    public static void main(String[] args) {
        MaximumSubarray53 obj = new MaximumSubarray53();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(obj.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int max = 0;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum <= 0) {
                if (nums[i] > sum) {
                    sum = nums[i];
                } else {
                    sum = 0;
                    continue;
                }
            } else {
                sum = sum + nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
