package binarysearchandrecursion;

import java.util.Arrays;

public class SearchSortedMatrix {

    public static void main(String args[]) {
        System.out.println("hello");
        int[][] matrix = {{1, 2, 3}, {4, 5, 7}, {8, 9, 10}};
        int target = 7;
        int[] result = search(matrix, target);
        int[] expected = new int[]{1,2};
        if (Arrays.equals(result,expected)) {
            System.out.println("Passed");
        } else {
            System.out.println("failed" + " Expected " + Arrays.toString(expected) + " however result is " +
                    Arrays.toString(result));

        }


    }

    private static int[] search(int[][] matrix, int target) {
        int[] result = new int[]{-1, -1};
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};

        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / columns;
            int col = mid % columns;
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return new int[]{-1, -1};

    }
}
