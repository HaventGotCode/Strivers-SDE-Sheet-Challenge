package com.practice.array;

import com.practice.tags.difficulty.Medium;
import com.practice.tags.resources.BabbarSupreme;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.StriverSheetArrays;

public class SortColors75 implements Medium, Creek300, BabbarSupreme, StriverSheetArrays {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        SortColors75 obj = new SortColors75();
        obj.sortColors(nums);
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, high, mid);
                high--;
            }
        }
    }

    private void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
