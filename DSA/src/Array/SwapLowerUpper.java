package Array;

import java.util.*;

public class SwapLowerUpper {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // print the swap elements
            swapLowerUpperElement(arr,n);
        }
    }

    public static void swapLowerUpperElement(int[][] arr, int n) {
        for (int i = 0; i < n; i++) { // n
            for (int j = 0; j < n; j++) { // n
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
