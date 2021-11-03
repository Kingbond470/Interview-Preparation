package LinearSearch;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {18, 34, 35, 5, -2, 53, 46, 75};
        int target = -2, start = 1, end = 5;
        System.out.println(searchInRange(arr, target, start, end));
    }

    // search the element in range: return index position

    static int searchInRange(int[] arr, int target, int start, int end) {

        // if size of array is zero : return -1
        if (arr.length == 0) return -1;

        // run a loop : if target found  return index position
        for (int i = start; i < end; i++) {
            if (arr[i] == target) return i;
        }

        // element did not found
        return -1;
    }
}
