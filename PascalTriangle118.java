package com.practice.array;

import com.practice.tags.difficulty.Easy;
import com.practice.tags.resources.StriverSheetArrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 implements Easy, StriverSheetArrays {
    public static void main(String[] args) {
        PascalTriangle118 obj = new PascalTriangle118();
        int numRows = 5;
        List<List<Integer>> result = obj.generate(numRows);
        System.out.println(result);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> nestedResult = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || i == j) {
                    nestedResult.add(1);
                } else {
                    nestedResult.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(nestedResult);
        }
        return result;
    }
}
