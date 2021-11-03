package LinearSearch;

public class FindMinAndMax {

    public static void main(String[] args) {
        int[] arr = {12, 45, 35, 645, -3, 6, 56};
        System.out.println("Min of array is : " + findMin(arr));
        System.out.println("Max of array is : " + findMax(arr));
    }

    // finding a minimum value in array : return minimum value
    // Suppose, length of array is not zero
    static int findMin(int[] ar) {

        // assume, the minimum value is at zero index
        int ans = ar[0];

        // run a loop : find a min value
//        for(int element: ar){
//            if(ans>element) ans=element;
//        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < ans) ans = ar[i];
        }

        return ans;
    }

    static int findMax(int[] arr) {

        // assume, the first element at index zero is maximum value
        int ans = arr[0];

        // run a loop : find a maximum value
        for (int element : arr) {
            if (element > ans) ans = element;
        }

        return ans;
    }
}
