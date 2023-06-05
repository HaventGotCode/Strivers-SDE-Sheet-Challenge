package com.practice.array;

import com.practice.tags.resources.StriverSheetArrays;

public class SetMatrixZeroes73 implements StriverSheetArrays {
    public static void main(String[] args) {
        SetMatrixZeroes73 obj = new SetMatrixZeroes73();
        int[][] matrix1 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] matrix2 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix3 = {{1, 0, 3}};
        int[][] matrix4 = {{1}, {0}, {3}};
        int[][] matrix = {{1, 2, 3, 4}, {5, 0, 7, 8}, {0, 10, 11, 12}, {13, 14, 15, 0}};

        obj.printMatrix(matrix);
        obj.setZeroes(matrix);
        System.out.println();
        obj.printMatrix(matrix);
    }

    private void setZeroes(int[][] matrix) {
        int zerothCol = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) {
                        zerothCol = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (zerothCol == 0) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
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
