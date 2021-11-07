package BinarySearch;

public class OrderDiagnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 8, 7, 5, 4, 3, 2, 1};
        int target = -2;
        System.out.println(orderDiagnosticBinarySearch(arr, target));
    }

    // when the order of array is not known - ascending / descending order
    // to find the order and target element
    static int orderDiagnosticBinarySearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        // to find the order of array
        boolean isAscending = arr[start] < arr[end];

        /*
         if( arr[start] < arr[end]) isAscending=true;
        else isAscending=false;
         */

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // target element is equal to mid element : return index of middle
            if (target == arr[mid]) return mid;

            if (isAscending) {
                if (target > arr[mid]) start = mid + 1;
                else end = mid - 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;

    }
}
