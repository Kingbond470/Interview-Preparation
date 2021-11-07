package Array;

public class ReversWithSpace {

    public static void main(String[] args) {
        String str = "Mausam Singh";
        char[] arr = str.toCharArray();

        reversNameWithSpace(arr);
    }
    /*

 In Simple worst case, it will run n*n

        cur =0,
        end = 5
        i = 5, 4, 3, 2, 1, 0

        cur=0,
        i=0
        end =5,
        Mausam
     */

    static void printVal(char[] arr, int cur, int end) {

        for (int i = cur; i <= end; i++) {
            System.out.print(arr[i]);
        }
        System.out.print(cur != 0 ? " " : "");
    }

    static void reversNameWithSpace(char[] arr) {

        int cur = 0, end = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                cur = 0;
                printVal(arr, cur, end);
            }

            if (arr[i] == ' ') {
                cur = i + 1;
                printVal(arr, cur, end);
                end = cur - 1;
            }
        }
    }


}
/*
Input - Mausam Singh
 output - Singh Mausam
 */
