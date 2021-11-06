package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2, 45, 51, 67, 78, 98, 100};
        int target = 100;
        System.out.println(binarySearch(arr, target));
    }

    // to find the target element in array
    static int binarySearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            // calculating the mid value
            int mid = start + (end - start) / 2;

            // if target element is equal to mid
            if (target == arr[mid]) return mid;
            else if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

}
