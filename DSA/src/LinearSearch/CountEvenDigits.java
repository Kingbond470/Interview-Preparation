package LinearSearch;

public class CountEvenDigits {


    public static void main(String[] args) {
        int[] nums = {12, 234, 6, 76, 45356};

        System.out.println(countTotalEven(nums));
    }

    // to calculate the total even digits of number in array
    static int countTotalEven(int[] nums) {
        int count = 0;
        for (int element : nums) {
            if (element >= 10 && element < 100 || element >= 1000 && element < 10000 || element >= 100000 && element < 1000000) {
                count++;
            }
        }
        return count;
    }


    // to calculate the total even digits of number in array
    static int countTotalEvenDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (countEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    // to check the count to number is even or not with optimize approach
    static boolean countEvenDigits(int num) {
        if (num < 0) num = num * -1;
        int val = (int) Math.log10(num) + 1;
        return val % 2 == 0;
    }

    // to check the count of number is even or not
    static boolean countEventDigits(int num) {
       /*
        String str=num+"";
        int length=str.length();
        return length%2==0;
        */

        // without using string
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count % 2 == 0;
    }
}
