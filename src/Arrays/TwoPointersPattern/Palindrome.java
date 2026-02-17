package Arrays.TwoPointersPattern;

class Palindrome {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<j){
            if(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))) return false;

            i++;
            j--;
        }
        return true;
    }
}
