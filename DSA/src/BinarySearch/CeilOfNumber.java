package BinarySearch;

import java.util.Arrays;

public class CeilOfNumber {

    public static void main(String[] args) {

        int[] arr = {9, 8, 10, 14, 15, 75, 12};

        // to find ceil - first sort the array
        Arrays.sort(arr);

         /*
           8 9 10 12 14 15 75

           target - find the ceil of this number in array
           9

           ceil - number which is greater than or equal to given number (  but that number should be smallest greatest)

          */
        int target = 76;
        // System.out.println(ceilOfNumber(arr, target));

        System.out.println(ceilOfNumberBS(arr, target));
    }

    // finding the ceil of number - brute force
    static int ceilOfNumber(int[] arr, int target) {
        int res = arr[0];
        for (int element : arr) {
            if (element >= target) {
                res = element;
                break;
            }
        }
        return res;
    }

    // finding the ceil of number - BS
    static int ceilOfNumberBS(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            // finding middle element
            int mid = start + (end - start) / 2;

            // mid element
            if (target == arr[mid]) return mid;
            else if (target < arr[mid]) {
                ans = arr[mid];
                end = mid - 1;
            } else start = mid + 1;
        }

        return ans;
    }

}



