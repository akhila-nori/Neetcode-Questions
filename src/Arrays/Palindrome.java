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
