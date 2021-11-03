package LinearSearch;

import java.util.Arrays;

public class LinearSearchInString {

    public static void main(String[] args) {
        String name = "Mausam";
        char target = 's';

        System.out.println(linearSearchInStringForEach(name, target));

        // System.out.println(Arrays.toString(name.toCharArray()));
    }


    // search  a character in a string : return true
    static boolean linearSearchInString(String name, char target) {

        // if length of string is zero : return false
        if (name.length() == 0) return false;

        // run a loop  : character found then return true
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) return true;
        }

        // character not found
        return false;
    }

    /*
    2. Using for each loop
     */

    static boolean linearSearchInStringForEach(String name, char target) {

        // if length of string is zero : return false
        if (name.length() == 0) return false;

        // run a for each loop, convert the string in to char array
        for (char ch : name.toCharArray()) {
            if (ch == target) return true;
        }

        // character not found
        return false;
    }

}
