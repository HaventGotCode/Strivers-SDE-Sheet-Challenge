package com.practice.array;

import com.practice.tags.difficulty.Easy;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.StriverSheetArrays;

public class MergeSortedArray88 implements Easy, StriverSheetArrays, Creek300 {
    public static void main(String[] args) {
        /*int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;*/

        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        MergeSortedArray88 obj = new MergeSortedArray88();
        obj.merge(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + ", ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1EndIndex = m - 1;
        int nums2EndIndex = n - 1;
        int endIndex = nums1.length - 1;
        while (nums1EndIndex >= 0 && nums2EndIndex >= 0) {
            if (nums1[nums1EndIndex] > nums2[nums2EndIndex]) {
                nums1[endIndex] = nums1[nums1EndIndex];
                nums1EndIndex = nums1EndIndex - 1;
            } else {
                nums1[endIndex] = nums2[nums2EndIndex];
                nums2EndIndex = nums2EndIndex - 1;
            }
            endIndex = endIndex - 1;
        }
        while (nums2EndIndex >= 0) {
            nums1[endIndex] = nums2[nums2EndIndex];
            nums2EndIndex = nums2EndIndex - 1;
            endIndex = endIndex - 1;
        }
    }
}
