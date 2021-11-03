package LinearSearch;

public class LinearSearchInString {

    public static void main(String[] args) {
        String name = "Mausam";
        char target = 's';

        System.out.println(linearSearchInString(name, target));
    }


    // search  a character in a string : return true
    static boolean linearSearchInString(String name, char target) {

        // if length of string is zero : return false
        if (name.length() == 0) return false;

        // run a loop by converting string into character array : character found then return true
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) return true;
        }

        // character not found
        return false;
    }

}
