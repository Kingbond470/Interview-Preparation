package Array;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {12, 34, 35, 65, 7};
        reverseArray(arr);

        /*
         index - 0 , 1
         start - 12 , 34
         last - 7 , 65
         arr - 7, 65, 35, 34, 12
         */

        for (int element : arr) {
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

}
