package LinearSearch;

public class RicherCustomerWealth {

    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {5,3},
        };

        System.out.println(richestCustomer(arr));
    }

    static int richestCustomer(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int customer = 0; customer < arr.length; customer++) {

            int csum = 0;
            for (int accountant = 0; accountant < arr[customer].length; accountant++) {
                csum = csum + arr[customer][accountant];
            }
            max = Math.max(csum, max);
        }

        return max;
    }
}
