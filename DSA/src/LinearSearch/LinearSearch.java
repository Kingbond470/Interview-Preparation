package LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {23, 44, 56, 4, 64, 35, 9, 87};
        int target = 87;
        System.out.println(linearSearchBoolean(arr, target));

    }

    // to search in array : return the index of element
    // otherwise element not found then return -1
    static int linearSearch(int[] arr, int target) {

        // if size of array is zero, then element does not exist
        if (arr.length == 0) return -1;

        // run a loop to check if element is present in array
        for (int i = 0; i < arr.length; i++) {

            // if current element is equal to target then return index
            if (arr[i] == target) return i;

        }
        // element does not exist in array
        return -1;
    }

    // 2
    // from an array: if element found then return the element
    // otherwise return Integer.MAX_VALUE

    static int linearSearchElement(int[] arr, int target) {

        // if array size is zero then return Integer.MAX_VALUE
        if (arr.length == 0) return Integer.MAX_VALUE;

        //run a loop and if element found then return the element
        for (int element : arr) {
            if (element == target) return element;
        }

        // element did not found
        return Integer.MAX_VALUE;
    }

    /*
    3. Return a boolean value - if element is present in the array
     */

    static boolean linearSearchBoolean(int[] arr, int target) {

        // if array size is zero then element is not present : return false
        if (arr.length == 0) return false;

        //run a loop : if element is present then return true
        for (int element : arr) {
            if (element == target) return true;
        }
        // element is not present : return false
        return false;
    }

}

/*
Time Complexity -
    Best Case - O(1) - > constant time
    Worst Case - O(n)
    because it follows the linear pattern( with the increase of number of input, the time will increase as well in form of linear)
Space Complexity -
    O(1)
    No space is used other than reference variable
 */