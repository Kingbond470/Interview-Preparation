package Array;

public class ReversWithSpace {

    public static void main(String[] args) {
        String str = "You are awesome value";
        char[] arr = str.toCharArray();


        //  reversNameWithSpace(arr);
        // reversePrint(arr);
        reversePrint1(arr);
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


    // brute force
    static void reversePrint(char[] arr) {

        String res = "";
        for (char element : arr) res += element;
        //System.out.println(res);

        String[] res1 = res.split(" ");
        for (int i = res1.length - 1; i >= 0; i--) System.out.print(res1[i] + " ");

    }

    static void reversePrint1(char[] arr) {

        String res = "";
        for (char element : arr) res += element;
        //System.out.println(res);
        int cur = 0, end = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                cur = 0;
                System.out.print(res.substring(cur, end + 1));
            }

            if (arr[i] == ' ') {
                cur = i + 1;
                System.out.print(res.substring(cur, end == arr.length - 1 ? end + 1 : end) + " ");
                end = cur - 1;
            }
        }


    }


}
/*
Input - Mausam Singh
output - Singh Mausam
T(c) - O(n*n)
S(c) - O(1)
 */

