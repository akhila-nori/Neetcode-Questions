package Arrays;

class Palindrome {
    public static void main(String[] args) {

        String s = "Was it a car or a cat I saw?";
        boolean value = isPalindrome(s);
        System.out.println(value);
    }

    public static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String cleanedString = cleaned.toString();
        cleaned.reverse();
        String reversedString = cleaned.toString();
        return cleanedString.equals(reversedString);
    }
}
//Time complexity - O(n)
//Filtering/Cleaning: You iterate through the entire string once using s.toCharArray(). This is O(n).
//Converting to String: cleaned.toString() visits every character once. This is O(n).
//Reversing: cleaned.reverse() also visits every character to swap them. This is O(n).
//Comparison: equals() compares each character in both strings. This is O(n).
//Since we drop constants in Big O notation ($O(4n)$ becomes O(n)), the total time complexity is linear.



// Space complexity - O(n)
//StringBuilder: You create a new StringBuilder that stores up to n characters.
//Strings: You create two additional strings (cleanedString and reversedString), each taking up to n space.
//Total: You are using roughly $O(3n)$ extra memory. This is still considered linear space, $O(n)$.
