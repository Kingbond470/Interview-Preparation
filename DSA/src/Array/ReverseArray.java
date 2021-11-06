package Array;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {12, 34, 35, 65, 7};
        // reverseArray(arr);
        int[] res = reverseArrayUsingNewArray(arr);
        /*
         index - 0 , 1
         start - 12 , 34
         last - 7 , 65
         arr - 7, 65, 35, 34, 12
         */

        for (int element : res) {
            System.out.print(element + " ");
        }
    }

    // reverse the element in array
    static int[] reverseArray(int[] arr) {

        // run a loop : store value from start and last
        //  do swap
        for (int index = 0; index < arr.length / 2; index++) {
            int start = arr[index];
            int last = arr[arr.length - index - 1];

            // swap the element with each other
            int temp = start;
            arr[index] = last;
            arr[arr.length - index - 1] = temp;
        }
        return arr;
    }
    // TC - O(n) SC - O(1)

    // creating new array, and storing each value from reverse order
    static int[] reverseArrayUsingNewArray(int[] ar) {
        int[] res = new int[ar.length];
        int i = 0;
        for (int index = ar.length - 1; index >= 0; index--) {
            res[i++] = ar[index];
        }
        return res;
    }
    // TC - O(n) SC - O(n)

}
