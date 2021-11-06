package LinearSearch;

public class CountEvenDigits {


    public static void main(String[] args) {
        int[] nums={12, 234, 6, 76, 45356};

        System.out.println(countTotalEvenDigits(nums));
    }

    // to calculate the total even digits of number in array
    static int countTotalEvenDigits(int[] nums){
        int count=0;

        for( int num: nums){

            if(countEventDigits(num)){
                count++;
            }
        }
        return count;
    }

    // to check the count of number is even or not
     static boolean countEventDigits(int num) {
        String str=num+"";
        int length=str.length();
        return length%2==0;
    }
}
