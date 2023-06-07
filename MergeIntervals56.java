package com.practice.array;

import com.practice.tags.difficulty.Medium;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.StriverSheetArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals56 implements Medium, StriverSheetArrays, Creek300 {
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals = {{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}};
        MergeIntervals56 obj = new MergeIntervals56();
        obj.printMatrix(obj.merge(intervals));
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int[] currentResultInterval = intervals[0];
        result.add(currentResultInterval);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentResultInterval[1] && intervals[i][1] > currentResultInterval[1]) {
                currentResultInterval[1] = intervals[i][1];
            } else if (intervals[i][0] > currentResultInterval[1]) {
                result.add(intervals[i]);
                currentResultInterval = intervals[i];
            }
        }
        int[][] resultArr = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
