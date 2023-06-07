package com.practice.array;

import com.practice.tags.difficulty.Medium;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.StriverSheetArrays;

public class FindTheDuplicateNumber287 implements Medium, StriverSheetArrays, Creek300 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        FindTheDuplicateNumber287 obj = new FindTheDuplicateNumber287();
        System.out.println(obj.findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        //This solution works only if the element is appearing twice, in case of multiple occurrence it won't work
        /*int length = nums.length;
        int actualSum = 0;
        for (int i = 0; i < length; i++) {
            actualSum = actualSum + nums[i];
        }
        int expectedSum = length * (length + 1) / 2;
        return length - (expectedSum - actualSum);*/

        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        int find = 0;

        while (find != slow) {
            slow = nums[slow];
            find = nums[find];
        }
        return find;
    }
}
