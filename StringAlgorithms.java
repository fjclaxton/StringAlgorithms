public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        String s = "";
        for (int i = 0; i<word.length(); i++) {
            s+= word.substring(i, i+1);
            s+="\n";
        }
        return s;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String s = "";
        for (int i = 0; i<word.length(); i++) {
            s+= word.substring((word.length() - i)-1, (word.length()-i));
            s+="\n";
        }
        return s;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String word) {
        // TODO: Implement this method
        String s = "";
        for (int i = 0; i<word.length(); i++) {
        if (i<1) {
            s+= word.substring(i, i+1).toUpperCase();
        } else {
            if (word.substring(i-1, i).isBlank()) {
               s+= word.substring(i, i+1).toUpperCase();
            } else {
               s+= word.substring(i, i+1);
            }
        }
        }
        return s;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        boolean s = false;
        for (int i = 0; i<word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length()-1)) {
               s = true;
            } else {
               s = false;
            }
        }
        return s;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        char c = ' ';
        for (int i = 0; i<word.length(); i++) {
            c = word.charAt(i);
            for (int v = 0; v<word.length(); v++) {
               if (c == word.charAt(v) && i!=v) {
                  break;
               }
               if (v+1 == word.length()) {
                  return c;
               }
            }
        }
        
        return c;
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        System.out.println(printCharacters("hello"));
        // Example:
        // System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        System.out.println(reverseWord("hello"));
        // Example:
        // System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        System.out.println(capitalizeString("the quick brown fox"));
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        System.out.println(detectPalindrome("racecar"));
        // Example:
        // System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        System.out.println(firstUniqueChar("swiss"));
    }
}
