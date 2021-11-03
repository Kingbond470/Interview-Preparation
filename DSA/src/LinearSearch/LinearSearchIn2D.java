package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearchIn2D {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 13, 24, 34},
                {24, 543, 56, 3, 63},
                {35, 63},
                {3, 35, 6}
        };
        int target = 90;
        int[] ans = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(searchMaxIn2D(arr));
        System.out.println(searchMinIn2D(arr));

    }

    // searching in 2D array : return the list of row, col index position
    static int[] searchIn2D(int[][] arr, int target) {

        // array length is zero : return -1, -1
        if (arr.length == 0) return new int[]{-1, -1};

        // run a lop through row and col of 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) return new int[]{row, col};
            }
        }

        // element was not found
        return new int[]{-1, -1};

    }

    // finding a max element
    static int searchMaxIn2D(int[][] arr) {

        // assume, size is array is not zero,
        int max = arr[0][0];

        // run a loop: return max element
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) max = arr[row][col];
            }
        }
        return max;
    }

    // finding min using for each
    static int searchMinIn2D(int[][] arr) {
        int min = arr[0][0];

        // in each, 2D array : it contains a single one D array as well
        // run a loop : return min
        for (int[] row : arr) {
            for (int element : row) {
                if (element < min) min = element;
            }
        }

        return min;
    }


}
