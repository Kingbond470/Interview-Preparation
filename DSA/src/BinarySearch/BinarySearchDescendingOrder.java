package BinarySearch;

public class BinarySearchDescendingOrder {

    public static void main(String[] args) {
        int[] arr = {90, 80, 20, 10, 5, 1};
        int target=90;

        System.out.println(binarySearch(arr, target));
    }

    // search the target element in array : return the index
    static int binarySearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            // finding the mid element
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) end = mid - 1;
            else if (target < arr[mid]) start = mid + 1;
            else return mid;

        }

        // if target element did not found : return -1
        return -1;
    }


}
