package com.practice.array;

import com.practice.tags.difficulty.Medium;
import com.practice.tags.resources.Creek300;
import com.practice.tags.resources.StriverSheetArrays;

public class RotateImage48 implements Medium, StriverSheetArrays, Creek300 {
    public static void main(String[] args) {
        RotateImage48 obj = new RotateImage48();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        obj.rotate(matrix);
        obj.printMatrix(matrix);
    }

    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }

    private void reverse(int[] matrix) {
        int start = 0;
        int end = matrix.length - 1;
        while (start < end) {
            int temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++;
            end--;
        }
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
